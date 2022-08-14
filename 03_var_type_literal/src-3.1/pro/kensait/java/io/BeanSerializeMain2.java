package pro.kensait.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BeanSerializeMain2 {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        String fileName =
                "C:/Java/eclipse_workspace/java/j2se/j2se_basic/file/bar.ser";
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(fileName));
            TargetBean target = (TargetBean)ois.readObject();
            int result = target.executeTask(3);
            System.out.println(result);
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