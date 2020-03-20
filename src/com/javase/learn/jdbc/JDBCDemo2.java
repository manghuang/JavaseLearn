package com.javase.learn.jdbc;

import java.sql.*;
import java.util.ArrayList;

public class JDBCDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet result = null;
        try{
            //1.导入驱动包
            //2.注册驱动
            //Class.forName("com.mysql.jdbc.Driver");
            //3.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?serverTimezone=UTC", "root" , "1234");
            //4.定义SQL语句
            String sql1 = "select * from threebody";
            //5.获取执行sql语句的对象
            statement = conn.createStatement();
            //6.执行sql
            //6.1 查询
            result = statement.executeQuery(sql1);
            //7.处理结果
            //7.1 遍历查询结果
            System.out.println("查询操作的结果：");
            ArrayList<ThreeBody> aList = new ArrayList<>();
            while (result.next()){
                ThreeBody threeBody = new ThreeBody();
                threeBody.setId(result.getInt(1));
                threeBody.setName(result.getString(2));
                threeBody.setWhich_section(result.getInt(3));
                threeBody.setChaech(result.getString(4));
                threeBody.setSay_what(result.getString(5));
                aList.add(threeBody);
            }
            for (ThreeBody th: aList) {
                System.out.println(th);
            }
            //8.释放资源
            result.close();
            statement.close();
            conn.close();
        }catch (SQLException se){
            System.out.println("操作数据库失败");
            se.printStackTrace();
        }finally {
            close(conn, statement, result);
        }

    }

    static void close(Connection conn, Statement statement, ResultSet result) {
        if(result != null){
            try {
                result.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
