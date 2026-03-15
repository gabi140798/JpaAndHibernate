package pl.kurs.zad1.model;

import java.io.Serial;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity

public class SlutHouse implements Serializable {

    @Serial
    private static final long serialVersionUID = -5483745958979340323L;
    @Id
    @GeneratedValue

    private int id;
    private String name, nickname;

    public SlutHouse(int id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }
}
