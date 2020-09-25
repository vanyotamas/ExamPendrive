package hu.kincstar.javasetraining.exampendrive;

import java.util.List;

public class Pendrives {
    // TODO ez akár statikus osztály is lehetne
    public Pendrive best(List<Pendrive> pendrives) {
        Pendrive res = pendrives.get(0);
        for (Pendrive p : pendrives) {
            if (res.comparePricePerCapacity(p) == 1)
                res = p;
        }
        return res;
    }

    public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive res = pendrives.get(0);
        for (Pendrive p : pendrives) {
            if (p.cheaperThan(res))
                res = p;
        }

        return res;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity)
    {
        for (Pendrive p : pendrives) {
            if (p.getCapacity() == capacity)
                p.risePrice(percent);
        }
    }
}
