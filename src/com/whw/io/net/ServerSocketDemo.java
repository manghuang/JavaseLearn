package com.whw.io.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes, 0,len));
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，我是服务器".getBytes());
        socket.shutdownOutput();
        //socket.close();
        serverSocket.close();

    }
}
