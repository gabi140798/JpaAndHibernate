package pl.kurs.zad1.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;


@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class  Slut implements Serializable {


    @Serial
    private static final long serialVersionUID = -5483745958979340323L;
    @Id
    @GeneratedValue

    private int id;
    private String name, lastName, preferences;
    private int age;
    private boolean hiv;

    public Slut(int id, String name, String lastName, String preferences, int age, boolean hiv) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.preferences = preferences;
        this.age = age;
        this.hiv = hiv;
    }
}
