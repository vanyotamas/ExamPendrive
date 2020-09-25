package hu.kincstar.javasetraining.exampendrive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pendrive> pendrives = new ArrayList<>();
        pendrives.add(new Pendrive("p1", 64, 2000));
        pendrives.add(new Pendrive("p2", 128, 3000));
        pendrives.add(new Pendrive("p3", 256, 4000));

        Pendrives ps = new Pendrives();
        System.out.println(ps.best(pendrives).toString());
        System.out.println(ps.cheapest(pendrives).toString());

        ps.risePriceWhereCapacity(pendrives, 150, 64);
        System.out.println(ps.best(pendrives).toString());
        System.out.println(ps.cheapest(pendrives).toString());
    }
}
/*
Készíts egy Pendrives osztályt, amely metódusaival pendrive-ok közül lehet kikeresni a megfelelőt.
A feladat részeként készíts egy Pendrive osztályt is.
A Pendrive tagjai:
•	attribútumai: name, capacity, price. A kapacitás egész szám Gb-ben megadott érték. Az ár egész szám forintban megadott érték.
•	Legyenek getterei az attribútumokra.
•	Legyen String toString() metódusa, amely egy Stringbe összefűzve adja vissza a pendrive adatait.
•	Legyen void risePrice(int percent) metódusa, amely megadott százalékkal megemeli a pendrive árát.
•	Legyen int comparePricePerCapacity(Pendrive) metódusa, amely összehasonlítja a példányt egy paraméterként kapott
        másik példánnyal az ár/kapacitás alapján.
        Az eredmény 1 legyen, ha az aktuális példány ár/kapacitása nagyobb, az eredmény -1 legyen ha a paraméterként
        kapott példányé nagyobb, és az eredmény 0 legyen, ha egyformák.
•	Legyen egy boolean cheaperThan(Pendrive) metódusa, amely igazat ad ha a példány ára kisebb, mint a paraméterben
        kapott példány ára.

A Pendrives részletei: A metódusokat úgy implementáld, hogy nem hívod a Pendrive getPrice() metódusát.
•	Legyen Pendrive best(List<Pendrive>) metódusa, amely a legjobb ár/kapacitás értékű pendrive-t adja vissza,
        azaz amelyiknél ez a legkisebb.
•	Legyen Pendrive cheapest(List<Pendrive>) metódusa, amely a legolcsóbbat adja vissza.
•	Legyen void risePriceWhereCapacity(List<Pendrive>, int percent, int capacity) metódusa, amely adott
        százalékkal megemeli azon pendrive-ok árát, amelynek a kapacitása a megadott értékkel megegyezik.
*/