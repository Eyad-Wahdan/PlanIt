package htw.berlin.webtech.PlanIt.Termin;

import htw.berlin.webtech.PlanIt.Termin.Termin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminRepository extends CrudRepository<Termin, Long> {
}
