package model;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
    private int eno;
    private String ename;
    private String grade;
    private String deptCode;

}
