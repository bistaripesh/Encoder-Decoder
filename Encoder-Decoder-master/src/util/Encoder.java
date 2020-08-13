/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Ripesh Bista
 */
public class Encoder {

    public void encode(String message) {
        char[] characters = message.toCharArray();
        int total = 0;
        int length = characters.length;
        double[] codes = new double[length];
        for (int b = 0; b < length; b++) {

            int a = (int) message.charAt(b);
            double x = (double) a;
            double y = 4252168 + x + 101;
            codes[b] = y;

            System.out.print(codes[b]);

            total = 1 + total;
        }
    }

}
