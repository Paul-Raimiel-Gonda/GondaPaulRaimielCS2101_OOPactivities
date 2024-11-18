public class Painter extends Artist{
    private Medium medium;

    public Painter(String name, int age, String specialty, Medium medium){
        super(name, age, specialty);
        this.medium = medium;
    }
    public void displayDetails(){
        System.out.println("Painter's Info: ");
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
        System.out.println("Medium: " + medium);
    }
}
