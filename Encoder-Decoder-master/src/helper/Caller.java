/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Scanner;
import util.Decoder;
import util.Encoder;

/**
 *
 * @author Ripesh
 */
public class Caller {
    
    Encoder encoder = new Encoder();
    Decoder decoder = new Decoder();
  
    Scanner sc = new Scanner(System.in);
    public void enoder() {
        System.out.println("Enter the text you want to encode");
        System.out.print(">");
        encoder.encode(sc.nextLine());
        System.out.println("");
        System.out.print(" : Is your encoded key ");
        System.out.println("");
        System.out.println("------------------------------------");
    }
    public void decoder(){
        System.out.println("Enter the code that you want to decode");
        System.out.print(">");
        decoder.decode(sc.next());
        System.out.println("");
        System.out.println(":is the decoded message");
    }
    public void openingMessage(){
        System.out.println("------------------------------------------");
        System.out.println("WELCOME TO ENCODER AND DECODER");
        System.out.println("------------------------------------------");
        System.out.println("Press 1 to Encode");
        System.out.println("Press 2 to Decode the Encoded Message");
        System.out.println("Press 0 to exit");
        System.out.println("------------------------------------------");
    }

}
