package htw.berlin.webtech.PlanIt.Termin.DTO;

import java.sql.Timestamp;

public class Termin {

    private Long id;
    private Timestamp start;
    private Timestamp finish;
    private String event;

    public Termin(Long id, Timestamp start, Timestamp finish, String event) {
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.event = event;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Timestamp getFinish() {
        return finish;
    }

    public void setFinish(Timestamp finish) {
        this.finish = finish;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
