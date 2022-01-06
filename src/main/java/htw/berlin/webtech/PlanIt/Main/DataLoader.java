package htw.berlin.webtech.PlanIt.Main;

import htw.berlin.webtech.PlanIt.Termin.TerminEntity;
import htw.berlin.webtech.PlanIt.Termin.TerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    private TerminRepository repository;

    @Autowired
    public DataLoader(TerminRepository repository) {
        this.repository = repository;
    }

    public void run(ApplicationArguments args) {

        TerminEntity zahnarztTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-10-25 10:00:00"),
                java.sql.Timestamp.valueOf("2022-10-25 12:00:00"), "Zahnarzttermin");

        TerminEntity hochzeitsTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-02-05 18:00:00"),
                java.sql.Timestamp.valueOf("2022-02-05 22:00:00"), "Hochzeitstermin");

        TerminEntity tierarztTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-29 08:00:00"),
                java.sql.Timestamp.valueOf("2022-01-29 09:00:00"), "Tierarzttermin");

        TerminEntity anwaltTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-02-15 14:00:00"),
                java.sql.Timestamp.valueOf("2022-02-15 16:00:00"), "Anwalt");

        repository.saveAll(List.of(zahnarztTerminEntity, hochzeitsTerminEntity, tierarztTerminEntity, anwaltTerminEntity));
    }
}
