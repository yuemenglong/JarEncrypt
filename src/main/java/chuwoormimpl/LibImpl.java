package chuwoormimpl;

import chuwoormapi.Lib;

public class LibImpl implements Lib {
    public void print() {
        System.out.println("My Class Name Is " + this.getClass().getName());
    }
}
