package in.sigma.entity;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Bank {
    String customerName;
    String email;
    @EmbeddedId
    BankPk bankPrimaryKey;

}
