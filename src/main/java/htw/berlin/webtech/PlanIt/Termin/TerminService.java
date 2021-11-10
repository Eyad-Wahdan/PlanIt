package htw.berlin.webtech.PlanIt.Termin;

import htw.berlin.webtech.PlanIt.Termin.Termin;
import htw.berlin.webtech.PlanIt.Termin.TerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminService {

    @Autowired
    TerminRepository repository;

    public Termin save(Termin termin) {
        return repository.save(termin);
    }

    public Termin get(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException());
    }
}
