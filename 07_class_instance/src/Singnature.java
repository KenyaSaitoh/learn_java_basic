
public class Singnature {
    /*
    void fooMethod(int x) {}
    String fooMethod(int x) {return null;}
    String fooMethod(int y) {return null;}
    public void fooMethod(int x) {}
    */
    int fooMethod(int x) { return 0; }
    int fooMethod(int x, int y) { return 0; }
    int fooMethod(String str) { return 0; }
}
