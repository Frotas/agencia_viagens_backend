package br.com.voetuor.server.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "passage")
public class Passage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_passage", unique = true, nullable = false)
    private String pk_passage;
    @Column(name = "first_name", nullable = false)
    private String first_name;
    @Column(name = "last_name", nullable = false)
    private String last_name;
    @Column(name = "passage_type", nullable = false)
    private String passage_type;
    @Column(name = "seat", nullable = false)
    private String seat;
    @Column(name = "gate", nullable = false)
    private String gate;
//    @Column(name = "origin", nullable = false)
//    private String origin;
//    @Column(name = "destiny", nullable = false)
//    private String destiny;
    @Column(name = "board_group", nullable = false)
    private Integer board_group;
    @Column(name = "board_time", nullable = false)
    private String board_time;
    @Column(name = "departs", nullable = false)
    private String departs;
    @Column(name = "arrives", nullable = false)
    private String arrives;

    public String getPk_passage() {
        return pk_passage;
    }

    public void setPk_passage(String pk_passage) {
        this.pk_passage = pk_passage;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassage_type() {
        return passage_type;
    }

    public void setPassage_type(String passage_type) {
        this.passage_type = passage_type;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public Integer getBoard_group() {
        return board_group;
    }

    public void setBoard_group(Integer board_group) {
        this.board_group = board_group;
    }

    public String getBoard_time() {
        return board_time;
    }

    public void setBoard_time(String board_time) {
        this.board_time = board_time;
    }

    public String getDeparts() {
        return departs;
    }

    public void setDeparts(String departs) {
        this.departs = departs;
    }

    public String getArrives() {
        return arrives;
    }

    public void setArrives(String arrives) {
        this.arrives = arrives;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Passage passage)) return false;
        return Objects.equals(getPk_passage(), passage.getPk_passage()) && Objects.equals(getSeat(), passage.getSeat()) && Objects.equals(getGate(), passage.getGate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPk_passage(), getSeat(), getGate());
    }
}
