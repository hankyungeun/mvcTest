package mvcTest.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Todo {
    @Id
    //자동생성
    @GeneratedValue
    private Long id;
    @Column(nullable = false, length = 50)
    private String todo;
    @Column(name="create_date")
    @CreationTimestamp
    private LocalDateTime createDate;
    @Column(name="end_date")
    private LocalDateTime endDate;
    @ManyToOne
    //foreign key
    @JoinColumn(name="member_id")
    private Member member;

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", todo='" + todo + '\'' +
                ", createDate=" + createDate +
                ", endDate=" + endDate +
                ", member=" + member +
                '}';
    }
}
