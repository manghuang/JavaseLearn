package com.javase.learn.jdbc;

import java.sql.*;

public class JDBCDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        try{
            //1.导入驱动包
            //2.注册驱动
            //Class.forName("com.mysql.jdbc.Driver");
            //3.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?serverTimezone=UTC", "root" , "1234");
            //4.定义SQL语句
            //String sql1 = "select * from threebody";
            String sql2 = "update threebody set say_what = ? where name = ?";
            //5.获取执行sql语句的对象
            //statement = conn.prepareStatement(sql1);
            statement = conn.prepareStatement(sql2);
            //6、给？赋值
            statement.setString(1,"一个星星");
            statement.setString(2,"程天明");
            //7.执行sql
            //result = statement.executeQuery();
            int lines = statement.executeUpdate();
            //8.处理结果
//            ArrayList<ThreeBody> aList = new ArrayList<>();
//            while (result.next()){
//                ThreeBody threeBody = new ThreeBody();
//                threeBody.setId(result.getInt(1));
//                threeBody.setName(result.getString(2));
//                threeBody.setWhich_section(result.getInt(3));
//                threeBody.setChaech(result.getString(4));
//                threeBody.setSay_what(result.getString(5));
//                aList.add(threeBody);
//            }
//            for (ThreeBody th: aList) {
//                System.out.println(th);
//            }
            System.out.println("更新影响的行数：" + lines);
            //9.释放资源
            //result.close();
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
