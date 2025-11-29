package in.sigma.springdatajpa_first.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class StudentPK implements Serializable {
    private String phoneNumber;
    private String roll;

}
