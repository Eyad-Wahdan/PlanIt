package htw.berlin.webtech.PlanIt.Termin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminRepository extends CrudRepository<Termin, Long> {
}
