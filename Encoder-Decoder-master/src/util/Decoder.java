/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Ripesh Bista
 */
public class Decoder {

    Scanner sc = new Scanner(System.in);

    public void decode(String inpu) {
        int len = inpu.length();
        for (int i = 0; i < len; i++) {
            if (i <= len) {
                if (inpu.charAt(i) == '.') {
                    int j = i - 7;
                    String decode = inpu.substring(j, i + 2);
                    float number = Float.valueOf(decode);
                    float result = number - 101 - 4252168;
                    char u = (char) result;
                    System.out.print(u);

                }

            }

        }
    }
}
