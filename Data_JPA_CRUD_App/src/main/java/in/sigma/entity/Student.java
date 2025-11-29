package in.sigma.entity;

import in.sigma.generators.StudentIdGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(generator = "student_id")
    @GenericGenerator(
            name = "student_id",
            strategy = "in.sigma.generators.StudentIdGenerator"
    )
    String studentId;
    String name;
}
