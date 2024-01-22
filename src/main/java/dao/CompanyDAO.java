package dao;

import db.CompanyConnection;
import model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyDAO {

    public int insert(String ename, String grade, String deptCode) {
        Connection conn = CompanyConnection.getInstance();
        String sql = "insert into employee(ename, grade, deptCode) values ( ?, ? , ?)";
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1,ename);
            psmt.setString(2,grade);
            psmt.setString(3,deptCode);
            int num = psmt.executeUpdate();
            return num;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }


    public Employee selectByNumber(int number) {
        Connection conn = CompanyConnection.getInstance();
        String sql = "select * from employee where eno = ?";
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, number);
            ResultSet rs = psmt.executeQuery();
            boolean isRow = rs.next();
            if (isRow) {
                Employee employee = new Employee(
                        rs.getInt ("eno"),
                        rs.getString("ename"),
                        rs.getString("grade"),
                        rs.getString("deptCode")
                );
                return employee;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
