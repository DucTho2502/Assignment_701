package fa.training.entities;

public class Ford extends Car{

    int year;
    int manufacturerDiscount;

    @Override
    public double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }

    public Ford() {
    }

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public String toString() {
        return "Ford{" +
                "year=" + year +
                ", manufacturerDiscount=" + manufacturerDiscount +
                ", speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
