package pro.kensait.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardMain {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please Input : ");
            String str = br.readLine();
            System.out.println("Input Data ---> " + str);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}