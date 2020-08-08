package chuwoormapi;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Lib lib = (Lib) Class.forName("chuwoormimpl.LibImpl").newInstance();
        lib.print();
    }
}
