package htw.berlin.webtech.PlanIt.Termin;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class TerminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private LocalTime time;

    @Column(nullable = false)
    private String event;

    protected TerminEntity() {
    }

    public TerminEntity(LocalDate date, LocalTime time, String event) {
        this.date = date;
        this.time = time;
        this.event = event;
    }

    @Override
    public String toString() {
        return "Termin{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", event='" + event + '\'' +
                '}';
    }

    public Long getId() {
        return id;
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
