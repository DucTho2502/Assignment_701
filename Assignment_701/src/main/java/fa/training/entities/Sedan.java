package fa.training.entities;

public class Sedan extends Car{

    int length;

    @Override
    public double getSalePrice() {
        if(length > 20){
            return regularPrice * 0.95;
        }else{
            return regularPrice * 0.9;
        }
    }

    public Sedan() {
    }

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "length=" + length +
                ", speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
