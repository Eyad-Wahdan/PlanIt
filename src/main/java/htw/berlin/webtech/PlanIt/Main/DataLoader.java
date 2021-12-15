package htw.berlin.webtech.PlanIt.Main;

import htw.berlin.webtech.PlanIt.Termin.TerminEntity;
import htw.berlin.webtech.PlanIt.Termin.TerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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

        TerminEntity zahnarztTerminEntity = new TerminEntity(LocalDate.of(2022, 10, 25),
                java.time.LocalTime.of(12, 30), "Zahnarzttermin");

        TerminEntity hochzeitsTerminEntity = new TerminEntity(LocalDate.of(2022, 6, 14),
                java.time.LocalTime.of(15, 30), "Mein Hochzeitstermin");

        TerminEntity tierarztTerminEntity = new TerminEntity(LocalDate.of(2021, 12, 30),
                java.time.LocalTime.of(11, 25), "Tierarzttermin");

        TerminEntity anwaltTerminEntity = new TerminEntity(LocalDate.of(2022, 12, 19),
                java.time.LocalTime.of(16, 15), "Anwalt");

        repository.saveAll(List.of(zahnarztTerminEntity, hochzeitsTerminEntity, tierarztTerminEntity, anwaltTerminEntity));
    }
}