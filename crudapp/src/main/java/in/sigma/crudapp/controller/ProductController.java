package in.sigma.crudapp.controller;

import in.sigma.crudapp.entity.Product;
import in.sigma.crudapp.entity.Ticket;
import in.sigma.crudapp.repository.ProductRepositoty;
import in.sigma.crudapp.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class ProductController {

    @Autowired
    private ProductRepositoty productRepositoty;

    @Autowired
    private TicketService ticketService;


    @PostMapping("/addData")
    public ResponseEntity<Product> addProduct(@RequestBody Product data){
//        System.out.println(data);
        Product savedProduct = productRepositoty.save(data);
        System.out.println("prddd"+savedProduct);
        return new ResponseEntity<Product>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping("/alllist")
    public ResponseEntity<Page<Product>> getAllProduct(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String direction,
            @RequestParam(required = false) String search
    ) {

        Sort sort = direction.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);

        Page<Product> products;

        if (search != null && !search.isEmpty()) {
            products = productRepositoty
                    .searchProducts(search, pageable);
        } else {
            products = productRepositoty.findAll(pageable);
        }

        return ResponseEntity.ok(products);
    }

    @GetMapping("/allTicket")
    public ResponseEntity<List<Ticket>> allTicket(){
        List<Ticket> tickets = ticketService.getAvailableTicket();
        return ResponseEntity.ok(tickets);
    }
}
