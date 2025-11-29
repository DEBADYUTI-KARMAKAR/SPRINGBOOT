package in.sigma.springdatajpa_first.entity;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student_tbl")
public class Student {
    String name;
    String standerd;
    @EmbeddedId
    StudentPK studentPK;
}
