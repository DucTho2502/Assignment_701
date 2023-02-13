package fa.training.entities;

public class Truck extends Car{

    int weight;
    @Override
    public double getSalePrice() {
        if(weight > 2000){
            return regularPrice * 0.9;
        }else{
            return regularPrice * 0.8;
        }
    }

    public Truck() {
    }

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
