package pl.kurs;

import pl.kurs.dao.CarDao;
import pl.kurs.dao.CarDaoImpl;
import pl.kurs.model.Car;

public class Main {
    public static void main(String[] args) {


        // ORM - Object Relational Mapping - mapowanie obiektowo relacyjne

        // java application -> object - orm -> baza danych

        // jpa -> java persistence api - oficjalny standard mapowania obiektowo relacyjnego
        // java application -> jap layer - jdbc -> baza danych

//        jpa layer - zbiór interfejsow i wytycznych jak ma byc realizowane utrwalanie obiektow w bazie danych

        // encja entity - odpowiednik klasy, reprezentuje obiekt lub klase ktora jest mapowana do tabeli w bazie danych

        // pojo Plain Old Java Object - odpowiednik encjim jedno pojo jeden rekord w bazie danych

        // entity manager favtory - fanbryka zadzadcow encji, z niej pobieramy instancje entity managera

        // entity manager - zarzadca encjami, interfejs do wykonywania operacji na encjachm, zapis/odczytr itd

        // w katalogu resources tworzymy katalok META-INF persistence.xml bedzie to glowny plik do konfiguracyjny dla bazy danych
        // w pliku musi sie znajdowac przynajkniej jedna jednostka utrwalania

        // dao - Data access object -> obiekt dostepu do danych, kazda encja ma swoje dao
        // dao impl - implementacja metod z interfejsu dao

        Car car = new Car("Mercedes", "S63", "black", 2018);

        CarDao carDao = new CarDaoImpl();
        // zapis
        carDao.save(car);
        System.out.println("zapisano");

        // pobrania auta po id
        Car loadedCar =  carDao.getCar(1L);
        System.out.println("odczytano");
        System.out.println(loadedCar);

          /* Wykorzstyujac poznane technologie stwórz serwis do zarządzania domem publicznym.
           Mamy tabele prostytuka która ma id, imie, nazwisko, preferencje, wiek oraz to czy dziwka ma hiv.

           Kolejna tabela bedzie burdel id, nazwa, pseudonim burdel mamy.

           Stwórz model dziwki i burdelu.
           Stwórz dao do zapisu i odczytu dziwek i burdelu.
           Zapisz kilka dziwek i burdelow do bazy danych
           Odczytaj dziwki, znajdz dziwki które maja hiv ale sa niepelnoletnie
        */

        // @OneToMany
        // @ManyToOne


    }
}
