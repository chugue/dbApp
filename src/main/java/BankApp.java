import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankApp {
    public static void main(String[] args) {
        Connection conn = DBConnection.getInstance();
        try {
            String insert = "insert into account_tb(password, balance, created_at) values(?,?,now())";
            String delete = "delete from account_tb where number = ?";
            String update = "update account_tb set balance = balance + ? where number = ?";
            // 쿼리용 버퍼 PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(delete);
            pstmt.setInt(1,1);
            pstmt.executeUpdate();
            int num = pstmt.executeUpdate();
            System.out.println(num);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
