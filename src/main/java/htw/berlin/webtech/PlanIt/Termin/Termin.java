package htw.berlin.webtech.PlanIt.Termin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Termin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private LocalTime time;
    private String event;

    public Termin() {
    }

    public Termin(Long id, LocalDate date, LocalTime time, String event) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.event = event;
    }

    @Override
    public String toString() {
        return "Termin{" + "id=" + id + ", Datum=" + date + ", Uhrzeit=" + time + ", Ereignis=" + event + "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

}
