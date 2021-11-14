package htw.berlin.webtech.PlanIt.Main;

import htw.berlin.webtech.PlanIt.Termin.Termin;
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

        Termin zahnarztTermin = new Termin(LocalDate.of(2021, 11, 25),
                java.time.LocalTime.of(12, 30), "Mein Zahnarzttermin");

        Termin hochzeitsTermin = new Termin(LocalDate.of(2022, 1, 15),
                java.time.LocalTime.of(15, 30), "Mein Hochzeitstermin");

        repository.saveAll(List.of(zahnarztTermin, hochzeitsTermin));
    }
}
