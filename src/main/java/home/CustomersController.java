package home;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomersController {

    private final ArrayList<Customer> customers = new ArrayList<>();

    private CustomersController() {
        customers.add(new Customer("ed", 37));
    }

    @RequestMapping("/list")
    public List<Customer> list() {
        return customers;
    }

    @PostMapping("/add")
    public void add(@RequestBody Customer customer) {
        customers.add(customer);
    }
}
