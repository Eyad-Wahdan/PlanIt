package htw.berlin.webtech.PlanIt.Termin.DTO;

import java.sql.Timestamp;

public class TerminCreate {

    private Timestamp start;
    private Timestamp finish;
    private String event;

    public TerminCreate() {}

    public TerminCreate(Timestamp start, Timestamp finish, String event) {
        this.start = start;
        this.finish = finish;
        this.event = event;
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
