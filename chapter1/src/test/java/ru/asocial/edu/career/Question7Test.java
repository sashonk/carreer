package ru.asocial.edu.career;

import org.junit.Assert;
import org.junit.Test;

public class Question7Test {

    @Test
    public void test(){
        int[][] data = new int[5][];
        data[0] = new int[]{1,1,1,2,7};
        data[1] = new int[]{2, 3, 3, 9,0};
        data[2] = new int[]{4,4,5,6,1};
        data[3] = new int[]{7,7,8,8,8};
        data[4] = new int[]{0,9, 6, 7,7};

        {
            StringBuilder sb = new StringBuilder();
            print(data, sb);
            String expectation =
                            "1 1 1 2 7 \n" +
                            "2 3 3 9 0 \n" +
                            "4 4 5 6 1 \n" +
                            "7 7 8 8 8 \n" +
                            "0 9 6 7 7 \n";
            Assert.assertEquals(expectation, sb.toString());
        }
        {
            Question7.rotate90(data);
            StringBuilder sb = new StringBuilder();
            print(data, sb);
            String expectation2 =
                            "0 7 4 2 1 \n" +
                            "9 7 4 3 1 \n" +
                            "6 8 5 3 1 \n" +
                            "7 8 6 9 2 \n" +
                            "7 8 1 0 7 \n";

            Assert.assertEquals(expectation2, sb.toString());
        }
    }

    @Test
    public void testV2(){
        int[][] data = new int[5][];
        data[0] = new int[]{1,1,1,2,7};
        data[1] = new int[]{2, 3, 3, 9,0};
        data[2] = new int[]{4,4,5,6,1};
        data[3] = new int[]{7,7,8,8,8};
        data[4] = new int[]{0,9, 6, 7,7};

        {
            StringBuilder sb = new StringBuilder();
            print(data, sb);
            String expectation =
                            "1 1 1 2 7 \n" +
                            "2 3 3 9 0 \n" +
                            "4 4 5 6 1 \n" +
                            "7 7 8 8 8 \n" +
                            "0 9 6 7 7 \n";
            Assert.assertEquals(expectation, sb.toString());
        }
        {
            Question7.rotate90_v2(data);
            StringBuilder sb = new StringBuilder();
            print(data, sb);
            String expectation2 =
                            "0 7 4 2 1 \n" +
                            "9 7 4 3 1 \n" +
                            "6 8 5 3 1 \n" +
                            "7 8 6 9 2 \n" +
                            "7 8 1 0 7 \n";

            Assert.assertEquals(expectation2, sb.toString());
        }
    }

    @Test
    public void test_zero_array(){
        int[][] data = new int[0][];
        Question7.rotate90(data);
        {
            Question7.rotate90(data);
            StringBuilder sb = new StringBuilder();
            print(data, sb);
            String expectation2 = "";
            Assert.assertEquals(expectation2, sb.toString());
        }
    }

    @Test
    public void test_single_element_array(){
        int[][] data = new int[1][];
        data[0] = new int[]{1};
        Question7.rotate90(data);
        {
            Question7.rotate90(data);
            StringBuilder sb = new StringBuilder();
            print(data, sb);
            String expectation2 = "1 \n";
            Assert.assertEquals(expectation2, sb.toString());
        }
    }

    static void print(int[][] data, StringBuilder sb) {
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length; j++) {
                sb.append(data[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
    }
}
