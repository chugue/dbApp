package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CompanyConnection {
    public static Connection getInstance () {
        String username = "root";
        String password = "1234";
        String url = "jdbc:mariadb://localhost:3306/empoloyee";

        try {
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("연결 되었습니다.");
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
