package htw.berlin.webtech.PlanIt.Termin;

import htw.berlin.webtech.PlanIt.Termin.Termin;
import htw.berlin.webtech.PlanIt.Termin.TerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Termin> findAll(){
        List<Termin> termini = (List<Termin>) repository.findAll();
        return termini.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }

    public Termin create(TerminCreate request){
        var terminEntity = new Termin(request
                .getDate(),request.getTime(),request.getEvent());
        terminEntity = repository.save(terminEntity);
        return transformEntity(terminEntity);
    }

    public Termin findById(Long id){
        var terminEntity = repository.findById(id);
        return terminEntity.map(this::transformEntity).orElse(null);
    }

    public boolean deleteById (Long id){
        if (!repository.existsById(id)){
            return false;
        }
        repository.deleteById(id);
        return true;
    }

    private Termin transformEntity(Termin terminEntity){
        return new Termin(
                terminEntity.getId(),
                terminEntity.getDate(),
                terminEntity.getTime(),
                terminEntity.getEvent()
        );
    }
}