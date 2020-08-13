/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import helper.Caller;
/**
 *
 * @author Ripesh Bista
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caller call = new Caller();
        
        while(true){
         call.openingMessage();
        int input = sc.nextInt();
        
        if (input == 1){
            call.enoder();
        }
        if (input ==2){
            call.decoder();
        }
       if (input ==0){
           System.out.println("BYE!");
           System.exit(0);
       
        }
        }
    }
}
