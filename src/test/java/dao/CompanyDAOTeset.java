package dao;

import model.Employee;
import org.junit.jupiter.api.Test;

public class CompanyDAOTeset {

    @Test
    public void selectByNumberTest () {
        int number = 3;
        CompanyDAO dao = new CompanyDAO();
        Employee employee = dao.selectByNumber(number);
        if (employee == null) {
            System.out.println(number + "로 조회한 값이 없습니다.");
        }else {
            System.out.println(employee);
        }
    }

    @Test
    public void insertTest () {
        String ename = "주호선생님";
        String grade = "선생님";
        String deptCode = "AA" ;

        CompanyDAO dao = new CompanyDAO();
        int result = dao.insert(ename, grade, deptCode);
        if (result == 1){
            System.out.println("입력 성공");
        }else {
            System.out.println("입력값을 다시 한번 확인해주세요");
        }
    }
}
