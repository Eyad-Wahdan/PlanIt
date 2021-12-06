package htw.berlin.webtech.PlanIt.Termin.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class TerminCreate {

    private LocalDate date;
    private LocalTime time;
    private String event;

    public TerminCreate(LocalDate date, LocalTime time, String event) {
        this.date = date;
        this.time = time;
        this.event = event;
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
