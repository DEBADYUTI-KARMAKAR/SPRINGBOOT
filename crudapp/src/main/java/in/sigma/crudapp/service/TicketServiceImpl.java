package in.sigma.crudapp.service;

import in.sigma.crudapp.entity.Ticket;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{
    private String GET_TICKET_URL="http://localhost:9090/alllist";

    @Override
    public List<Ticket> getAvailableTicket() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Ticket>> alllistData = restTemplate.exchange(GET_TICKET_URL,
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Ticket>>() {
                }) ;

        return alllistData.getBody();
    }
}
