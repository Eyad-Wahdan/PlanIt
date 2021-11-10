package htw.berlin.webtech.PlanIt.Termin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TerminController {

    @Autowired
    TerminService service;

    @GetMapping("/termin/")
    public String handleBase() {
        return "Erstelle jetzt einen Termin!";
    }
}
