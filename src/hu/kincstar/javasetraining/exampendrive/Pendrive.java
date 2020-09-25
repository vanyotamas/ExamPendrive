package hu.kincstar.javasetraining.exampendrive;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public void risePrice(int percent)
    {
        price += price * (percent / 100.0);
    }

    public double pricePerCapacity()
    {
        return (double)price / capacity;
    }

    public int comparePricePerCapacity(Pendrive other) {
        double ppself = pricePerCapacity();
        double ppother = other.pricePerCapacity();
        return ppself > ppother ? 1 : ppself < ppother ? -1 : 0;
    }

    public boolean cheaperThan(Pendrive other)
    {
        return price < other.getPrice();
    }
}
