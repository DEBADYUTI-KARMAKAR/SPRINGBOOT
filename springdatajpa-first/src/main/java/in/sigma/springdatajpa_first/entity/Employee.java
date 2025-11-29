package in.sigma.springdatajpa_first.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "emp_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer empId;
    private String empNAme;
    private Double empSalary;
    private String empGender;
    private String department;

    @CreationTimestamp
    @Column(name = "create_On",updatable = false)
    private LocalDateTime createdOn;
    @UpdateTimestamp
    @Column(name = "updateOn", insertable = false)
    private LocalDateTime updatedOn;
}
