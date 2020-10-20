package com.whw.io;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class OutputStreamDemo {

    public static void main(String[] args) throws IOException {
        String str1 = "a";
        String str2 = "你好";
        String str3 = "\n";
        String str4 = "\r\n";
        System.out.println(Arrays.toString(str1.getBytes()));
        System.out.println(Arrays.toString(str2.getBytes()));
        System.out.println(Arrays.toString(str3.getBytes()));
        System.out.println(Arrays.toString(str4.getBytes()));
        FileOutputStream fos = new FileOutputStream(".\\a.txt",true);
        fos.write(str4.getBytes());
        fos.write(str2.getBytes());
        fos.close();
    }
}


