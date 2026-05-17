package in.sigma.bccitickets.controller;

import in.sigma.bccitickets.entity.Ticket;
import in.sigma.bccitickets.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping("/addData")
    public ResponseEntity<Ticket> addTicket(@RequestBody Ticket data){
        Ticket ticketData = ticketRepository.save(data);
        return new ResponseEntity<Ticket>(ticketData, HttpStatus.CREATED);
    }
    @GetMapping("/alllist")
    public ResponseEntity<List<Ticket>> allTickit(){
        List<Ticket> all = ticketRepository.findAll();
        return new ResponseEntity<>(all,HttpStatus.OK);
    }
}
