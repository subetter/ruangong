import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnTest {
    public static void main(String[] args) throws Exception {
        // 加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获取连接对象
        String url = "jdbc:mysql://localhost:3306/csgl_db?useUnicode=true&characterEncoding=utf8";//jdbc:mysql://localhost:3306/csgl_db
        Connection connection = DriverManager.getConnection(url, "root", "123456");
        // 定义sql 语句
        String sql = "select * from user";
        // 创建执行对象
        Statement statement = connection.createStatement();
        // 执行查询sql语句
        ResultSet resultSet = statement.executeQuery(sql);
        // 输出结果集
        System.out.println(resultSet);
    }
}