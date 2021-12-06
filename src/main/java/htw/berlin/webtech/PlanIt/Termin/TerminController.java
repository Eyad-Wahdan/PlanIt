package htw.berlin.webtech.PlanIt.Termin;

import htw.berlin.webtech.PlanIt.Termin.DTO.Termin;
import htw.berlin.webtech.PlanIt.Termin.DTO.TerminCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class TerminController {

    @Autowired
    TerminService service;

    @GetMapping("/termin/")
    public ResponseEntity<List<Termin>> fetchTermine() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/termin/{id}")
    public ResponseEntity<Termin> fetchTerminById(@PathVariable Long id) {
        var termin = service.findById(id);
        return termin != null ? ResponseEntity.ok(termin) : ResponseEntity.notFound().build();
    }

    @PostMapping("/termin/")
    public ResponseEntity<Void> createTermin(@RequestBody TerminCreate terminCreate) throws URISyntaxException {
        var termin = service.create(terminCreate);
        URI uri = new URI("/termin/" + termin.getId());
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/termin/{id}")
    public ResponseEntity<Void> deleteTermin(@PathVariable Long id) {
        boolean successful = service.deleteById(id);
        return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

    @PutMapping("/termin/{id}")
    public ResponseEntity<Termin> updateTermin(@PathVariable Long id, @RequestBody TerminCreate terminUpdate) {
        var termin = service.update(id, terminUpdate);
        return termin != null ? ResponseEntity.ok(termin) : ResponseEntity.notFound().build();
    }

}
