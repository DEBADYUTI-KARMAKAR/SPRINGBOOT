package in.sigma.crudapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ticket {
    @Id
    @GeneratedValue
    Integer ticketId;
    String matchName;
    String ticketName;
    Double ticketPrice;
}
