package htw.berlin.webtech.PlanIt.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String handleBase() {
        return "Home";
    }

}
