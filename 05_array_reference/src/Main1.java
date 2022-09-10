public class Main1 {
    public static void main(String[] args) {
    }
     private boolean f(String str1, String str2) {   
        
        
         if (str1 == null && str2 != null) {
             return false;
        } else if (! str1.equals(str2)) {
            return false;
        }
        return true;
    }
}
