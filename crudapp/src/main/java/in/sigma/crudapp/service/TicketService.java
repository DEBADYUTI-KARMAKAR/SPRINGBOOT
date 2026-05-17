package in.sigma.crudapp.service;

import in.sigma.crudapp.entity.Ticket;

import java.util.List;

public interface TicketService {
    public List<Ticket> getAvailableTicket();
}
