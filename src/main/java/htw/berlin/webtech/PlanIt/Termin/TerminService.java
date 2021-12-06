package htw.berlin.webtech.PlanIt.Termin;

import htw.berlin.webtech.PlanIt.Termin.DTO.Termin;
import htw.berlin.webtech.PlanIt.Termin.DTO.TerminCreate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TerminService {

    @Autowired
    TerminRepository repository;

    public Termin create(TerminCreate terminCreate) {
        var terminEntity = new TerminEntity(terminCreate.getDate(), terminCreate.getTime(), terminCreate.getEvent());
        terminEntity = repository.save(terminEntity);
        return transformEntity(terminEntity);
    }

    public List<Termin> findAll() {
        List<TerminEntity> terminEntityList = repository.findAll();
        return terminEntityList.stream().map(this::transformEntity).collect(Collectors.toList());
    }

    public Termin findById(Long id) {
        var terminEntity = repository.findById(id);
        return terminEntity.map(this::transformEntity).orElse(null);
    }

    public boolean deleteById(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }

    public Termin update(Long id, TerminCreate terminUpdate) {
        var terminOptional = repository.findById(id);
        if (terminOptional.isEmpty()) {
            return null;
        }
        var terminEntity = terminOptional.get();
        terminEntity.setDate(terminUpdate.getDate());
        terminEntity.setTime(terminUpdate.getTime());
        terminEntity.setEvent(terminUpdate.getEvent());

        terminEntity = repository.save(terminEntity);

        return transformEntity(terminEntity);
    }

    private Termin transformEntity(TerminEntity terminEntity) {
        return new Termin(
                terminEntity.getId(),
                terminEntity.getDate(),
                terminEntity.getTime(),
                terminEntity.getEvent()
        );
    }
}