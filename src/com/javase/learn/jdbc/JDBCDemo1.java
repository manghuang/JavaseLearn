package com.javase.learn.jdbc;

import java.sql.*;

public class JDBCDemo1 {
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
            while (result.next()){
                int id = result.getInt(1);
                String name = result.getString(2);
                int which_section = result.getInt(3);
                String charac = result.getString(4);
                String say_what = result.getString(5);
                System.out.println(
                        "id=" + id +
                        ",name=" + name +
                        ",which_section=" + which_section +
                        ",charac=" + charac +
                        ",say_what=" + say_what );
            }
            //6.2 增加
            String sql2 = "insert into threebody values(6, '歌者', 3, '清理者', '藏好自己，做好清理')";
            int lines2 = statement.executeUpdate(sql2);
            //7.2 输出结果
            System.out.println("增加操作影响的行数：" + lines2);
            //6.3 删除
            String sql3 = "delete from threebody where id = 6";
            int lines3 = statement.executeUpdate(sql3);
            //7.3 输出结果
            System.out.println("删除操作影响的行数：" + lines3);
            //6.4 更新
            String sql4 = "update threebody set say_what = '三个童话' where name = '程天明'";
            int lines4 = statement.executeUpdate(sql4);
            //7.4 输出结果
            System.out.println("更新操作影响的行数：" + lines4);
            //8.释放资源
            result.close();
            statement.close();
            conn.close();
        }catch (SQLException se){
            System.out.println("操作数据库失败");
            se.printStackTrace();
        }finally {
            JDBCDemo2.close(conn, statement, result);
        }

    }
}
