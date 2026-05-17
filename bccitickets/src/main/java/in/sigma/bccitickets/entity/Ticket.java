package in.sigma.bccitickets.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
//import lombok.Generated;

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
