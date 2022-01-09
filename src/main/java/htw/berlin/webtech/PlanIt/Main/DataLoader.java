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

        TerminEntity zahnarztTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-13 10:00:00"),
                java.sql.Timestamp.valueOf("2022-01-13 12:00:00"), "Zahnarzttermin");

        TerminEntity meetingTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-13 14:00:00"),
                java.sql.Timestamp.valueOf("2022-01-13 17:00:00"), "Team-Meeting");

        TerminEntity arbeitTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-17 10:00:00"),
                java.sql.Timestamp.valueOf("2022-01-17 18:00:00"), "Arbeit");

        TerminEntity arbeit2TerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-19 10:00:00"),
                java.sql.Timestamp.valueOf("2022-01-19 18:00:00"), "Arbeit");

        TerminEntity klausurEngTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-24 10:00:00"),
                java.sql.Timestamp.valueOf("2022-01-24 14:00:00"), "Eng-Klausur");

        TerminEntity klausurProgTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-25 10:00:00"),
                java.sql.Timestamp.valueOf("2022-01-25 14:00:00"), "WebTech-Klausur");

        TerminEntity presMasTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-26 10:00:00"),
                java.sql.Timestamp.valueOf("2022-01-26 14:00:00"), "MAS-Management Präsentation");

        TerminEntity klausurStatTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-27 10:00:00"),
                java.sql.Timestamp.valueOf("2022-01-27 14:00:00"), "Statistik-Klausur");

        TerminEntity klausurConTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-28 10:00:00"),
                java.sql.Timestamp.valueOf("2022-01-28 14:00:00"), "Controlling-Klausur");

        TerminEntity tierarztTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-29 08:00:00"),
                java.sql.Timestamp.valueOf("2022-01-29 09:00:00"), "Lernen");

        TerminEntity lernenTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-01-29 10:00:00"),
                java.sql.Timestamp.valueOf("2022-01-29 19:00:00"), "Tierarzttermin");

        TerminEntity anwaltTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-02-15 14:00:00"),
                java.sql.Timestamp.valueOf("2022-02-15 16:00:00"), "Anwalt");

        TerminEntity physioTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-02-12 14:00:00"),
                java.sql.Timestamp.valueOf("2022-02-12 16:00:00"), "Physiotherapie");

        TerminEntity gymTerminEntity = new TerminEntity(java.sql.Timestamp.valueOf("2022-02-13 12:00:00"),
                java.sql.Timestamp.valueOf("2022-02-13 15:00:00"), "Gym");

        repository.saveAll(List.of(zahnarztTerminEntity,meetingTerminEntity,arbeitTerminEntity, arbeit2TerminEntity,
                klausurEngTerminEntity, klausurProgTerminEntity, presMasTerminEntity, klausurStatTerminEntity,
                klausurStatTerminEntity, klausurConTerminEntity, tierarztTerminEntity, lernenTerminEntity,anwaltTerminEntity,
                physioTerminEntity, gymTerminEntity));
    }
}
