package home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lookup {

    @RequestMapping("/getitdone")
    public String getItDone() {
        return "some data!";
    }
}
