package model;

import lombok.*;
import java.sql.Timestamp;

/*
 * DB에 Select 한 데이터를 담기 위한 오브젝트
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Data
public class Account {
    private int number;
    private String password;
    private int balance;
    //java.sql의  Timestamp
    private Timestamp created_at;
}
