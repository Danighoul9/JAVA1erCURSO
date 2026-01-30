package MisProyectos;
import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class JuegoOcaGUI extends JFrame {

    private static class Player {
        String name;
        int position = 0;     // 0 = salida
        int turnsToSkip = 0;  // turnos que pierde
        Color color;

        Player(String name, Color color) {
            this.name = name;
            this.color = color;
        }

        String getInitial() {
            if (name == null || name.isEmpty()) return "?";
            return name.substring(0, 1).toUpperCase();
        }
    }

    private static final int FINAL_SQUARE = 63;

    // Ocas clásicas
    private static final Set<Integer> GEESE = new HashSet<>(Arrays.asList(
            5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59
    ));

    // Colores para jugadores (hasta 4)
    private static final Color[] PLAYER_COLORS = {
            new Color(220, 20, 60),   // rojo
            new Color(30, 144, 255),  // azul
            new Color(34, 139, 34),   // verde
            new Color(255, 140, 0)    // naranja
    };

    private List<Player> players = new ArrayList<>();
    private int currentPlayerIndex = 0;
    private final Random random = new Random();

    private BoardPanel boardPanel;
    private JLabel infoTurnoLabel;
    private JLabel infoEstadoLabel;
    private JButton tirarButton;
    private JTextArea logArea;

    private JPanel playersPanel; // panel lateral de jugadores

    public JuegoOcaGUI() {
        setTitle("Juego de la Oca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        // Barra de menú
        setJMenuBar(createMenuBar());

        // Panel superior de info
        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        infoTurnoLabel = new JLabel("Turno de: -", SwingConstants.CENTER);
        infoTurnoLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        infoEstadoLabel = new JLabel("Bienvenido al Juego de la Oca", SwingConstants.CENTER);
        topPanel.add(infoTurnoLabel);
        topPanel.add(infoEstadoLabel);
        add(topPanel, BorderLayout.NORTH);

        // Panel central -> tablero
        boardPanel = new BoardPanel();
        boardPanel.setPreferredSize(new Dimension(720, 560));
        add(boardPanel, BorderLayout.CENTER);

        // Panel inferior -> botón + log
        JPanel bottomPanel = new JPanel(new BorderLayout());

        tirarButton = new JButton("Tirar dados");
        tirarButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        tirarButton.addActionListener(e -> realizarTurno());
        bottomPanel.add(tirarButton, BorderLayout.NORTH);

        logArea = new JTextArea(6, 40);
        logArea.setEditable(false);
        logArea.setLineWrap(true);
        logArea.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(logArea);
        bottomPanel.add(scroll, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);

        // Panel lateral derecho -> jugadores + leyenda
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        rightPanel.setPreferredSize(new Dimension(230, 0));

        playersPanel = new JPanel();
        playersPanel.setLayout(new BoxLayout(playersPanel, BoxLayout.Y_AXIS));
        playersPanel.setBorder(BorderFactory.createTitledBorder("Jugadores"));
        rightPanel.add(playersPanel, BorderLayout.NORTH);

        JPanel legendPanel = createLegendPanel();
        rightPanel.add(legendPanel, BorderLayout.CENTER);

        add(rightPanel, BorderLayout.EAST);

        // Inicializar jugadores y partida
        initPlayersDialog();
        resetGame();

        pack();
        setLocationRelativeTo(null); // centrar
    }

    // ---------------- MENÚ ----------------

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuPartida = new JMenu("Partida");
        JMenuItem nueva = new JMenuItem("Nueva partida");
        JMenuItem reiniciar = new JMenuItem("Reiniciar");
        JMenuItem salir = new JMenuItem("Salir");

        nueva.addActionListener(e -> {
            initPlayersDialog();
            resetGame();
        });

        reiniciar.addActionListener(e -> resetGame());

        salir.addActionListener(e -> System.exit(0));

        menuPartida.add(nueva);
        menuPartida.add(reiniciar);
        menuPartida.addSeparator();
        menuPartida.add(salir);

        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem reglas = new JMenuItem("Ver reglas");
        JMenuItem acerca = new JMenuItem("Acerca de...");

        reglas.addActionListener(e -> mostrarReglasDialog());
        acerca.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "Juego de la Oca en Java\n" +
                            "Versión gráfica con Swing\n\n" +
                            "Por tu colega ChatGPT 😄",
                    "Acerca de",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        menuAyuda.add(reglas);
        menuAyuda.add(acerca);

        menuBar.add(menuPartida);
        menuBar.add(menuAyuda);

        return menuBar;
    }

    // Panel de leyenda lateral
    private JPanel createLegendPanel() {
        JPanel legend = new JPanel();
        legend.setLayout(new BoxLayout(legend, BoxLayout.Y_AXIS));
        legend.setBorder(BorderFactory.createTitledBorder("Leyenda"));

        legend.add(createLegendItem(new Color(255, 255, 204), "Oca (O): de oca a oca y tiras de nuevo."));
        legend.add(createLegendItem(new Color(204, 229, 255), "Puente (P): 6 ↔ 12 y tiras de nuevo."));
        legend.add(createLegendItem(new Color(255, 228, 196), "Posada (I): pierdes 1 turno."));
        legend.add(createLegendItem(new Color(204, 255, 229), "Pozo (Z): pierdes 2 turnos."));
        legend.add(createLegendItem(new Color(255, 222, 173), "Laberinto (L): vuelves a la 30."));
        legend.add(createLegendItem(new Color(255, 204, 204), "Cárcel (C): pierdes 3 turnos."));
        legend.add(createLegendItem(new Color(220, 220, 220), "Muerte (X): vuelves a la 1."));
        legend.add(createLegendItem(new Color(186, 255, 201), "Meta (F): casilla 63."));

        return legend;
    }

    private JPanel createLegendItem(Color c, String text) {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 2));
        JPanel colorBox = new JPanel();
        colorBox.setPreferredSize(new Dimension(16, 16));
        colorBox.setBackground(c);
        colorBox.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        JLabel label = new JLabel(text);
        label.setFont(new Font("SansSerif", Font.PLAIN, 11));
        p.add(colorBox);
        p.add(label);
        return p;
    }

    // ---------------- JUGADORES / PARTIDA ----------------

    private void initPlayersDialog() {
        int numJugadores;

        while (true) {
            String input = JOptionPane.showInputDialog(
                    this,
                    "¿Cuántos jugadores (2-4)?",
                    "Número de jugadores",
                    JOptionPane.QUESTION_MESSAGE
            );
            if (input == null) {
                // Si cancelan la primera vez, se cierra; si ya había jugadores, no tocamos
                if (players == null || players.isEmpty()) {
                    System.exit(0);
                } else {
                    return;
                }
            }
            try {
                numJugadores = Integer.parseInt(input.trim());
                if (numJugadores >= 2 && numJugadores <= 4) break;
            } catch (NumberFormatException ignored) {}
            JOptionPane.showMessageDialog(this,
                    "Introduce un número válido entre 2 y 4.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        players = new ArrayList<>();
        for (int i = 0; i < numJugadores; i++) {
            String nombre = JOptionPane.showInputDialog(
                    this,
                    "Nombre del jugador " + (i + 1) + ":",
                    "Jugador " + (i + 1),
                    JOptionPane.QUESTION_MESSAGE
            );
            if (nombre == null || nombre.trim().isEmpty()) {
                nombre = "Jugador " + (i + 1);
            }
            Color color = PLAYER_COLORS[i % PLAYER_COLORS.length];
            players.add(new Player(nombre.trim(), color));
        }

        refreshPlayersPanel();
    }

    private void refreshPlayersPanel() {
        playersPanel.removeAll();
        playersPanel.setLayout(new BoxLayout(playersPanel, BoxLayout.Y_AXIS));
        if (players != null) {
            for (Player p : players) {
                JPanel line = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 2));
                JPanel colorDot = new JPanel();
                colorDot.setPreferredSize(new Dimension(14, 14));
                colorDot.setBackground(p.color);
                colorDot.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
                JLabel lbl = new JLabel(p.name);
                lbl.setFont(new Font("SansSerif", Font.PLAIN, 12));
                line.add(colorDot);
                line.add(lbl);
                playersPanel.add(line);
            }
        }
        playersPanel.revalidate();
        playersPanel.repaint();
    }

    private void resetGame() {
        if (players == null || players.isEmpty()) return;
        for (Player p : players) {
            p.position = 0;
            p.turnsToSkip = 0;
        }
        currentPlayerIndex = 0;
        tirarButton.setEnabled(true);
        logArea.setText("");
        infoEstadoLabel.setText("Pulsa \"Tirar dados\" para empezar.");
        actualizarInfoTurno();
        boardPanel.repaint();
    }

    private void actualizarInfoTurno() {
        if (players == null || players.isEmpty()) {
            infoTurnoLabel.setText("Turno de: -");
            return;
        }
        Player p = players.get(currentPlayerIndex);
        infoTurnoLabel.setText("Turno de: " + p.name + "  |  Casilla actual: " + p.position);
    }

    // ---------------- LÓGICA DEL TURNO ----------------

    private void realizarTurno() {
        if (players == null || players.isEmpty()) return;

        Player p = players.get(currentPlayerIndex);

        // Comprobar si este jugador pierde turno
        if (p.turnsToSkip > 0) {
            appendLog(p.name + " pierde este turno. Turnos restantes: " + p.turnsToSkip);
            p.turnsToSkip--;
            pasarAlSiguienteJugador();
            return;
        }

        // Tirar dados
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int avance = dado1 + dado2;

        appendLog(p.name + " tira los dados: " + dado1 + " + " + dado2 + " = " + avance);

        // Mover jugador
        int viejaPos = p.position;
        moverJugador(p, avance);
        appendLog(p.name + " avanza de " + viejaPos + " a " + p.position);

        // Casilla especial (oca, puente, etc.)
        boolean turnoExtra = aplicarCasillaEspecial(p);

        // Actualizar tablero
        boardPanel.repaint();

        // Comprobar victoria
        if (p.position == FINAL_SQUARE) {
            appendLog("¡" + p.name + " ha llegado a la casilla 63 y GANA!");
            infoEstadoLabel.setText("¡" + p.name + " ha ganado la partida!");
            tirarButton.setEnabled(false);
            JOptionPane.showMessageDialog(this,
                    "¡" + p.name + " ha ganado la partida!",
                    "Fin del juego",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Si ha caído en posada / pozo / cárcel, ya se le han puesto turnos perdidos
        if (p.turnsToSkip > 0) {
            appendLog(p.name + " perderá " + p.turnsToSkip + " turno(s).");
            pasarAlSiguienteJugador();
            return;
        }

        if (turnoExtra) {
            appendLog(p.name + " tiene turno extra. Puede tirar de nuevo.");
            infoEstadoLabel.setText(p.name + " tiene turno extra. ¡Tira otra vez!");
            // No cambiamos currentPlayerIndex
            actualizarInfoTurno();
        } else {
            pasarAlSiguienteJugador();
        }
    }

    private void pasarAlSiguienteJugador() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        actualizarInfoTurno();
        infoEstadoLabel.setText("Pulsa \"Tirar dados\" para jugar.");
        boardPanel.repaint();
    }

    private void appendLog(String text) {
        logArea.append(text + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }

    // Movimiento con rebote si se pasa de la 63
    private void moverJugador(Player p, int avance) {
        int nuevaPos = p.position + avance;
        if (nuevaPos > FINAL_SQUARE) {
            int exceso = nuevaPos - FINAL_SQUARE;
            nuevaPos = FINAL_SQUARE - exceso;
            appendLog("Se pasa de la casilla 63, rebota hacia atrás hasta " + nuevaPos + ".");
        }
        p.position = nuevaPos;
    }

    /**
     * Aplica reglas especiales de la casilla donde está el jugador.
     * @return true si tiene turno extra (oca o puente).
     */
    private boolean aplicarCasillaEspecial(Player p) {
        int casilla = p.position;
        boolean turnoExtra = false;

        // OCAS
        if (GEESE.contains(casilla)) {
            int siguienteOca = encontrarSiguienteOca(casilla);
            if (siguienteOca != casilla) {
                appendLog("¡De oca a oca y tiro porque me toca!");
                appendLog(p.name + " va de la casilla " + casilla + " a la " + siguienteOca + ".");
                p.position = siguienteOca;
            } else {
                appendLog("Última oca, te quedas en la casilla " + casilla + ".");
            }
            turnoExtra = true;
        } else {
            switch (casilla) {
                case 6: // Puente
                    appendLog(p.name + " cae en el PUENTE (6). Va a la casilla 12 y vuelve a tirar.");
                    p.position = 12;
                    turnoExtra = true;
                    break;
                case 12: // Puente
                    appendLog(p.name + " cae en el PUENTE (12). Va a la casilla 6 y vuelve a tirar.");
                    p.position = 6;
                    turnoExtra = true;
                    break;
                case 19: // Posada
                    appendLog(p.name + " cae en la POSADA (19). Pierde 1 turno.");
                    p.turnsToSkip = Math.max(p.turnsToSkip, 1);
                    break;
                case 31: // Pozo
                    appendLog(p.name + " cae en el POZO (31). Pierde 2 turnos.");
                    p.turnsToSkip = Math.max(p.turnsToSkip, 2);
                    break;
                case 42: // Laberinto
                    appendLog(p.name + " cae en el LABERINTO (42). Retrocede a la casilla 30.");
                    p.position = 30;
                    break;
                case 52: // Cárcel
                    appendLog(p.name + " cae en la CÁRCEL (52). Pierde 3 turnos.");
                    p.turnsToSkip = Math.max(p.turnsToSkip, 3);
                    break;
                case 58: // Muerte
                    appendLog(p.name + " cae en la MUERTE (58). Vuelve a la casilla 1.");
                    p.position = 1;
                    break;
                default:
                    break;
            }
        }

        boardPanel.repaint();
        return turnoExtra;
    }

    private int encontrarSiguienteOca(int casillaActual) {
        int minMayor = Integer.MAX_VALUE;
        for (int o : GEESE) {
            if (o > casillaActual && o < minMayor) {
                minMayor = o;
            }
        }
        if (minMayor == Integer.MAX_VALUE) {
            return casillaActual; // última oca
        }
        return minMayor;
    }

    // ---------------- TABLERO GRÁFICO ----------------

    private class BoardPanel extends JPanel {

        private final int rows = 7;
        private final int cols = 9;
        private final int cellSize = 70;
        private final int margin = 20;

        BoardPanel() {
            setBackground(new Color(240, 248, 255)); // azulito claro
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Fondo
            g2.setColor(new Color(230, 230, 250));
            g2.fillRoundRect(margin / 2, margin / 2,
                    cols * cellSize + margin, rows * cellSize + margin, 30, 30);

            // Pintar celdas
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    int cellNumber = rowColToCell(row, col);
                    if (cellNumber < 1 || cellNumber > FINAL_SQUARE) continue;

                    int x = margin + col * cellSize;
                    int y = margin + row * cellSize;

                    // Color base según tipo de casilla
                    Color baseColor = new Color(245, 245, 245);
                    String etiqueta = "";

                    if (GEESE.contains(cellNumber)) {
                        baseColor = new Color(255, 255, 204); // amarillo claro
                        etiqueta = "O";
                    }
                    if (cellNumber == 6 || cellNumber == 12) {
                        baseColor = new Color(204, 229, 255); // azul puente
                        etiqueta = "P";
                    }
                    if (cellNumber == 19) {
                        baseColor = new Color(255, 228, 196); // posada
                        etiqueta = "I";
                    }
                    if (cellNumber == 31) {
                        baseColor = new Color(204, 255, 229); // pozo
                        etiqueta = "Z";
                    }
                    if (cellNumber == 42) {
                        baseColor = new Color(255, 222, 173); // laberinto
                        etiqueta = "L";
                    }
                    if (cellNumber == 52) {
                        baseColor = new Color(255, 204, 204); // cárcel
                        etiqueta = "C";
                    }
                    if (cellNumber == 58) {
                        baseColor = new Color(220, 220, 220); // muerte
                        etiqueta = "X";
                    }
                    if (cellNumber == FINAL_SQUARE) {
                        baseColor = new Color(186, 255, 201); // meta
                        etiqueta = "F";
                    }

                    g2.setColor(baseColor);
                    g2.fillRoundRect(x + 3, y + 3, cellSize - 6, cellSize - 6, 18, 18);

                    g2.setColor(Color.DARK_GRAY);
                    g2.drawRoundRect(x + 3, y + 3, cellSize - 6, cellSize - 6, 18, 18);

                    // Número de casilla
                    g2.setFont(new Font("SansSerif", Font.BOLD, 12));
                    String numStr = String.valueOf(cellNumber);
                    g2.drawString(numStr, x + 8, y + 16);

                    // Etiqueta tipo
                    if (!etiqueta.isEmpty()) {
                        g2.setFont(new Font("SansSerif", Font.BOLD, 16));
                        g2.drawString(etiqueta, x + cellSize - 20, y + 20);
                    }
                }
            }

            // Dibujar fichas de jugadores
            if (players != null) {
                Map<Integer, List<Player>> mapa = new HashMap<>();
                for (Player p : players) {
                    if (p.position <= 0) continue; // salida fuera
                    mapa.computeIfAbsent(p.position, k -> new ArrayList<>()).add(p);
                }

                for (Map.Entry<Integer, List<Player>> entry : mapa.entrySet()) {
                    int cell = entry.getKey();
                    List<Player> inCell = entry.getValue();

                    int[] rc = cellToRowCol(cell);
                    int row = rc[0];
                    int col = rc[1];

                    int x = margin + col * cellSize;
                    int y = margin + row * cellSize;

                    int baseX = x + cellSize / 2;
                    int baseY = y + cellSize / 2;

                    int radius = 18;

                    // offsets para hasta 4 jugadores en la misma casilla
                    int[][] offsets = {
                            {0, 0},
                            {-15, -10},
                            {15, -10},
                            {0, 18}
                    };

                    for (int i = 0; i < inCell.size(); i++) {
                        Player p = inCell.get(i);
                        int ox = offsets[Math.min(i, offsets.length - 1)][0];
                        int oy = offsets[Math.min(i, offsets.length - 1)][1];

                        int cx = baseX + ox - radius / 2;
                        int cy = baseY + oy - radius / 2;

                        g2.setColor(p.color);
                        g2.fillOval(cx, cy, radius, radius);
                        g2.setColor(Color.BLACK);
                        g2.drawOval(cx, cy, radius, radius);

                        g2.setFont(new Font("SansSerif", Font.BOLD, 12));
                        g2.drawString(p.getInitial(), cx + 6, cy + 13);
                    }
                }
            }

            // Zona "salida"
            drawSalida(g2);

            g2.dispose();
        }

        private void drawSalida(Graphics2D g2) {
            int x = margin;
            int y = margin + rows * cellSize + 10;

            g2.setColor(new Color(230, 230, 230));
            g2.fillRoundRect(x, y, 200, 50, 20, 20);
            g2.setColor(Color.DARK_GRAY);
            g2.drawRoundRect(x, y, 200, 50, 20, 20);

            g2.setFont(new Font("SansSerif", Font.BOLD, 14));
            g2.drawString("Salida (casilla 0)", x + 10, y + 20);

            if (players != null) {
                int offset = 0;
                for (Player p : players) {
                    if (p.position == 0) {
                        int cx = x + 20 + offset;
                        int cy = y + 28;
                        g2.setColor(p.color);
                        g2.fillOval(cx, cy, 16, 16);
                        g2.setColor(Color.BLACK);
                        g2.drawOval(cx, cy, 16, 16);
                        g2.setFont(new Font("SansSerif", Font.BOLD, 10));
                        g2.drawString(p.getInitial(), cx + 5, cy + 12);
                        offset += 24;
                    }
                }
            }
        }

        // fila/col a número de casilla, con recorrido serpenteante 1..63
        private int rowColToCell(int row, int col) {
            // filas 0..6 (0 arriba, 6 abajo)
            int filaDesdeAbajo = 6 - row; // 0 abajo, 6 arriba
            int base = filaDesdeAbajo * 9; // 0,9,18,...
            int posEnFila;
            if (filaDesdeAbajo % 2 == 0) {
                // fila par desde abajo: izquierda -> derecha
                posEnFila = col;
            } else {
                // fila impar desde abajo: derecha -> izquierda
                posEnFila = 8 - col;
            }
            return base + posEnFila + 1;
        }

        // número de casilla a fila/col
        private int[] cellToRowCol(int cell) {
            int idx = cell - 1;
            int filaDesdeAbajo = idx / 9;
            int posEnFila = idx % 9;
            int col;
            if (filaDesdeAbajo % 2 == 0) {
                col = posEnFila;
            } else {
                col = 8 - posEnFila;
            }
            int row = 6 - filaDesdeAbajo;
            return new int[]{row, col};
        }
    }

    // ---------------- REGLAS ----------------

    private void mostrarReglasDialog() {
        String reglas =
                "REGLAS BÁSICAS:\n\n" +
                        "• Tablero con casillas del 1 al 63.\n" +
                        "• Todos empiezan en la salida (0) y tiran dos dados.\n" +
                        "• Hay que llegar EXACTO a la casilla 63. Si te pasas, rebotas hacia atrás.\n\n" +
                        "Casillas especiales:\n" +
                        "• Ocas: 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59.\n" +
                        "  De oca a oca y tiras otra vez.\n" +
                        "• Puente: casillas 6 y 12 → saltas a la otra y tiras de nuevo.\n" +
                        "• Posada (19): pierdes 1 turno.\n" +
                        "• Pozo (31): pierdes 2 turnos.\n" +
                        "• Laberinto (42): vuelves a la casilla 30.\n" +
                        "• Cárcel (52): pierdes 3 turnos.\n" +
                        "• Muerte (58): vuelves a la casilla 1.\n" +
                        "• Meta (63): ganas la partida.\n";

        JOptionPane.showMessageDialog(this, reglas, "Reglas del juego", JOptionPane.INFORMATION_MESSAGE);
    }

    // ---------------- MAIN ----------------

    public static void main(String[] args) {
        try {
            // Look & Feel del sistema para que se vea más moderno
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            JuegoOcaGUI gui = new JuegoOcaGUI();
            gui.setVisible(true);
        });
    }
}
