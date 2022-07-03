package pro.kensait.java.character;

import java.util.StringTokenizer;

public class StringTokenizerMain {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("0836,0058,03000453,TY32001,USD,1000000,JPY,120000000", ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
