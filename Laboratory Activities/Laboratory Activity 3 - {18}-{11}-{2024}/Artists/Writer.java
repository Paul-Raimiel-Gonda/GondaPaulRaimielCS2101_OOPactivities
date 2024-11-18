public class Writer extends Artist{
    private String writingStyle;

    public Writer(String name, int age, String specialty, String writingStyle){
        super(name, age, specialty);
        this.writingStyle = writingStyle;
    }
    public void displayDetails(){
        System.out.println("Writer's Info: ");
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
        System.out.println("Writing Style: " + writingStyle);
    }
}
