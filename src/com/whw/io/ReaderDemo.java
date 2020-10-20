package com.whw.io;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./b.txt");
        int len = 0;
        char[] chars = new char[1024];
        while((len = fr.read(chars)) != -1){
            System.out.println(new String(chars, 0, len));
        }
        fr.close();
    }
}
