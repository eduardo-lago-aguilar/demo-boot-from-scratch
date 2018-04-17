package home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Customers {

    @RequestMapping("/list")
    public List<Customer> list() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("ed", 37));
        return customers;
    }
}
