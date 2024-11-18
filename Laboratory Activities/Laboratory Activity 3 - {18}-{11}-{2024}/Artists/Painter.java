public class Painter extends Artist{
    private String paintingStyle;

    public Painter(String name, int age, String specialty, String paintingStyle){
        super(name, age, specialty);
        this.paintingStyle = paintingStyle;
    }
    public void displayDetails(){
        System.out.println("Painter's Info: ");
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
        System.out.println("Painting Style: " + paintingStyle);
    }
}
