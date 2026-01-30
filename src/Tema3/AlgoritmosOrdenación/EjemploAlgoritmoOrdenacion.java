package Tema3.AlgoritmosOrdenación;


import java.util.Arrays;

public class EjemploAlgoritmoOrdenacion {
    public static void main(String[] args) {

        int[] nums = {100, 33, 55, 101 , 44, 12, 69, 98};

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

}
