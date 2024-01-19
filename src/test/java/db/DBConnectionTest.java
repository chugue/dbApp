package db;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {

    // 리턴타입을 적을 수 없다.
    // 매개변수를 적을 수 없다.
    // @Test를 붙이면 메소드 별도 실행 가능
    @Test
    public Connection getInstance_test() {
        String username = "root";
        String password = "1234";
        String url = "jdbc:mariadb://localhost:3306/cosdb";

        // 프로토콜이 적용된 소켓
        try {
            Connection conn = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
