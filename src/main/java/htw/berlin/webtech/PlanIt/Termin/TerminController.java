package htw.berlin.webtech.PlanIt.Termin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class TerminController {

    @Autowired
    TerminService service;

    @GetMapping("/termin/")
    public String handleBase() {
        return "Erstelle jetzt einen Termin!";
    }

    @GetMapping(path = "/termin/{id}")
    public ResponseEntity<Termin> fetchTerminById(@PathVariable Long id){
        var termin = service.findById(id);
        return termin != null? ResponseEntity.ok(termin) : ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/termin/{id}")
    public ResponseEntity<Void> deleteTermin (@PathVariable Long id){
        boolean successful = service.deleteById(id);
        return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

        @PostMapping("/termin/")
    public ResponseEntity<Void> createTermin(@RequestBody TerminCreate request) throws URISyntaxException {
       var termin =  service.create(request);
       URI uri = new URI("/termin/" + termin.getId());
       return ResponseEntity.created(uri).build();
    }
}
