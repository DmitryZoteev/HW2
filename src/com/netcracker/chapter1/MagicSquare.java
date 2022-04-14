package com.netcracker.chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {

    private int[][] massive;
    private int finalSum;

    public MagicSquare() {

    }

    public int sum(int... numbers){
        int result = 0;

        if(numbers == null) {
            return 0;
        }
        for(int number: numbers){
            result += number;
        }

        return result;
    }

    public boolean comparingStrings() {
        for(int[] temp : massive) {
            int value = sum(temp);
            if(finalSum != value) {
                return false;
            }
        }
        return true;
    }

    public boolean comparisonOfColumns() {
        for(int i = 0; i < massive.length; ++i) {
            int[] temp = new int[massive[i].length];
            for(int j = 0; j < massive[i].length; ++j) {
                temp[j] = massive[j][i];
            }
            int value = sum(temp);
            if(finalSum != value) {
                return false;
            }
            temp = null;
        }
        return true;
    }

    public boolean diagonalMatrices() {
        int[] temp = new int[massive.length];
        for(int i = 0; i < massive.length; ++i)
            temp[i] = massive[i][i];
        int value = sum(temp);
        if(finalSum != value) {
            return false;
        }

        temp = new int[massive.length];
        for(int i = 0, j = massive.length - 1; i < massive.length; ++i, --j) {
            temp[i] = massive[i][j];
        }
        value = sum(temp);

        return finalSum == value;
    }

    public void start()  {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Введите размер матрицы nxn: ");
        int size = Integer.parseInt(scanner.nextLine());
        String line;
        String[] arr;
        massive = new int[size][size];

        for (int i = 0; i < size; i++){
            line = scanner.nextLine();
            arr =  line.split(" ");
            for (int j = 0; j < size; j++)
                massive[i][j] = Integer.parseInt(arr[j]);
        }

        finalSum = sum(Arrays.copyOf(massive[0], massive[0].length));

        if(comparingStrings() && comparisonOfColumns() && diagonalMatrices())
            System.out.println("Это магический квадрат!");
        else
            System.out.println("Это не магический квадрат!");
    }
    /*
16 3 2 13
5 10 11 8
9 6 7 12
4 15 14 1
    */
}
