package com.javase.learn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./b.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("你好\n你好");
        fw.close();

    }
}
