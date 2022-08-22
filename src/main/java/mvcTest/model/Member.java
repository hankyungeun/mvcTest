package mvcTest.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


// 테이블 네임이랑 다를 경우 사용
// @Table(name="member")
@Entity
@Data
public class Member {
    // 기본키 설정
    @Id
    private String id;
    private String name;
    private String password;
    private String email;
    // 테이블 컬럼명
    @Column(name = "join_date")
    @CreationTimestamp
    private LocalDateTime joinDate;

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
