package pro.kensait.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializeMain2 {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        String fileName =
                "C:/Java/eclipse_workspace/java/j2se/j2se_basic/file/foo.ser";
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(fileName));
            SerializeTarget target = (SerializeTarget)ois.readObject();
            System.out.println("x ---> " + target.x);
            System.out.println("y ---> " + target.y);
            System.out.println("z ---> " + target.z);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } catch (ClassNotFoundException cnfe) {
            throw new RuntimeException(cnfe);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch(IOException ioe) {
                throw new RuntimeException(ioe);
            }
        }
    }
}