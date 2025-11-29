package in.sigma.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class BankPk implements Serializable {
    private String accountNumber;
    private String phone;


}
