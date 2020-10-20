package com.whw.io.net;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket( "127.0.0.1",8080);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，我是客户端".getBytes());
        socket.shutdownOutput();
        int len = 0;
        byte[] bytes = new byte[1024];
        InputStream inputStream = socket.getInputStream();
        while((len = inputStream.read(bytes)) != -1){
            System.out.println(new java.lang.String(bytes,0,len));
        }
        socket.close();
    }
}
