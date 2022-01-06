package htw.berlin.webtech.PlanIt.Termin;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class TerminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Timestamp start;

    @Column(nullable = false)
    private Timestamp finish;

    @Column(nullable = false)
    private String event;

    protected TerminEntity() {
    }

    public TerminEntity(Timestamp start, Timestamp finish, String event) {
        this.start = start;
        this.finish = finish;
        this.event = event;
    }

    @Override
    public String toString() {
        return "Termin{" +
                "id=" + id +
                ", start=" + start +
                ", finish=" + finish +
                ", event='" + event + '\'' +
                '}';
    }

    public Long getId() {
        return id;
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
