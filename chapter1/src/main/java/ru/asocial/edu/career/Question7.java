package ru.asocial.edu.career;

/**
 * there is an image represented by an N×N matrix; each pixel is represented by 4 bytes. Write a method to rotate an image 90 degrees.
 * Will you be able to perform this operation "on the spot"?
 */
class Question7 {

    public static void main(String[] argc) {
        int[][] data = new int[5][];
        data[0] = new int[]{1,1,1,2,7};
        data[1] = new int[]{2, 3, 3, 9,0};
        data[2] = new int[]{4,4,5,6,1};
        data[3] = new int[]{7,7,8,8,8};
        data[4] = new int[]{0,9, 6, 7,7};

        print(data);
        rotate90_v2(data);
        rotate90_v2(data);

        print(data);

    }

    static void print(int[][] data) {
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rotate90(int[][] pixels) {
        if (pixels == null) {
            throw new IllegalArgumentException("null value provided");
        }
        int n = pixels.length;
        int[][] copy = new int[n][];
        for (int i = 0; i < pixels.length; i++){
            copy[i] = new int[n];
            for (int j = 0; j < pixels.length; j++) {
                copy[i][j] = pixels[n-j-1][i];
            }
        }
        for (int i = 0; i < pixels.length; i++){
            System.arraycopy(copy, 0, pixels, 0, n);
        }
    }

    static void rotate90_v2(int[][] pixels) {
        if (pixels == null) {
            throw new IllegalArgumentException("null value provided");
        }
        int n = pixels.length;
        int i = 0;
        int buf;
        while (i < n / 2 + 1) {
            for (int j = i; j < n-i-1; j++) {
                    int i2 = n-j-1, j2 = i;
                    int i3 = n-j2-1, j3 = i2;
                    int i4 = n-j3-1, j4 = i3;
                    buf = pixels[i][j];
                    pixels[i][j] = pixels[i2][j2];
                    pixels[i2][j2] = pixels[i3][j3];
                    pixels[i3][j3] = pixels[i4][j4];
                    pixels[i4][j4] = buf;
            }
            i++;
        }
    }
}
