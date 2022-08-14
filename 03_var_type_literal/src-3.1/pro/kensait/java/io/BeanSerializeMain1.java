package pro.kensait.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BeanSerializeMain1 {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        String fileName =
                "C:/Java/eclipse_workspace/java/j2se/j2se_basic/file/bar.ser";
        TargetBean target = new TargetBean();

        //
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(target);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch(IOException ioe) {
                throw new RuntimeException(ioe);
            }
        }
    }
}

/* ======================================== */
class TargetBean implements Serializable {

    public int executeTask(int param) {
        return param * 2;
    }
}