public class Main {
    public static void main(String[] args) {
        Shape square = new Square(25);
        Shape rectangle = new Rectangle(16, 24);
        Shape triangle = new Triangle(25, 15, 20);

        // Collection of shapes
        Shape[] shapes = {square, rectangle, triangle};
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        // Displaying property values
        shapeCollection.getPropertyValues();
    }
}
