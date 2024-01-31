package pl.kurs.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;
//nieprywatny konstruktor bezparametrowy musi istniec bo hibernate korzysta z mechniazmu refleksji
// jak cos wczytujemy to hibernate korzysta z tego konstruktora i potem ustawia pola
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity // musi byc zeby klasa stala sie encja
// klasa nie moze byc final,musi byc mozliwosc dziedziczenia z tej klasy
public class Car implements Serializable {

    // kontrola wersji obiektu
    @Serial
    private static final long serialVersionUID = -5483745958979340323L;

    @Id //adnotacja id musi byc, id wyznacza klucz glowny encji, generowanie klucza spada na barki apki w takim przypadku
    // trzeba sprawdzic w bazie ostatni klucz, pobrac, zwiekszyc o 1 itd
    @GeneratedValue // zrzucamy odpowiedizalnosc za generowanie klucza na baze danych
    // zaden atrybut nie moze byc public
    private Long id;
    private String producer;
    private String model;
    private String color;
    @Column(name = "year_of_production")
    private Integer productio0nYear;

    public Car(String producer, String model, String color, Integer productio0nYear) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.productio0nYear = productio0nYear;
    }




}
