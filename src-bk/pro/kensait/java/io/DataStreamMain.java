package pro.kensait.java.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamMain {

    public static void main(String[] args) {
        String inputFileName = args[0];
        String outputFileName = args[1];
        try {
            float[] f1 = { 123.45F, 987.65F, -123.45F };
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream(inputFileName));
            for (int i = 0; i < f1.length; i++) {
                dos.writeFloat(f1[i]); // int値を書く
            }
            dos.close();
            DataInputStream dis = new DataInputStream(
                    new FileInputStream(outputFileName));
            float f2;
            while (true) {
                f2 = dis.readFloat(); // float値を読む
                System.out.println("ファイルから読み込んだfloat値 ---> " + f2);
            }
        } catch (EOFException e) {
            System.out.println("読み込み終了");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}