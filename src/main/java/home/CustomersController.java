package home;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomersController {

    private final ArrayList<Customer> customers = new ArrayList<>();

    private CustomersController() {
        customers.add(new Customer("ed", 37));
    }

    @GetMapping("/list")
    public List<Customer> list() {
        return customers;
    }

    @GetMapping("/lookup")
    public String lookupByParam(@RequestParam String name) {
        return name;
    }

    @GetMapping("/lookup/{name}")
    public String lookup(@PathVariable String name) {
        return name;
    }

    @PostMapping("/add")
    public void add(@RequestBody Customer customer) {
        customers.add(customer);
    }
}
