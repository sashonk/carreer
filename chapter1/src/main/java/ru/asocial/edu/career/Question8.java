package ru.asocial.edu.career;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm that implements the following condition: if an element of the matrix
 * M×N is 0, then the entire column and the entire row are set to zero
 */
public class Question8 {

    public static void main(String[] argc) {
        int[][] m = new int[4][];
        m[0] = new int[]{1,1,1,1,2};
        m[1] = new int[]{1,1,1,0,2};
        m[2] = new int[]{1,1,1,1,2};
        m[3] = new int[]{1,1,1,1,2};

        print(m);
        nullify(m);
        print(m);
    }

    static void print(int[][] data) {
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void nullify(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("null value provided");
        }
        Set<Integer> ii = new HashSet<>();
        Set<Integer> jj = new HashSet<>();
        for (int i =0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    ii.add(i);
                    jj.add(j);
                }
            }
        }
        ii.forEach(i -> {
            for (int o = 0; o < matrix[i].length; o++) {
                matrix[i][o] = 0;
            }
        });

        jj.forEach(j -> {
            for (int o = 0; o < matrix.length; o++) {
                matrix[o][j] = 0;
            }
        });
    }
}
