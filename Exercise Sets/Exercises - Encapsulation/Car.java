public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public char getSize() {
        return size;
    }
    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }

    @Override
    public String toString() {
        String sizeDescriptor;
        switch (size) {
            case 'S':
                sizeDescriptor = "small";
                break;
            case 'M':
                sizeDescriptor = "medium";
                break;
            case 'L':
                sizeDescriptor = "large";
                break;
            default:
                sizeDescriptor = "N/A";
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDescriptor);
    }

    public static void main(String[] args) {
        // Test cases
        Car car1 = new Car("purple", 875000.85, 'm');
        System.out.println(car1);

        Car car2 = new Car("neon brown", 2750000.00, 'L');
        System.out.println(car2);
    }
}
