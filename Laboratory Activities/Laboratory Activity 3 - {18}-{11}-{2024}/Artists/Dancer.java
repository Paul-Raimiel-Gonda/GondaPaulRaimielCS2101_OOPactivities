public class Dancer extends Artist{
    private DanceStyle danceStyle;

    public Dancer(String name, int age, String specialty, DanceStyle danceStyle){
        super(name, age, specialty);
        this.danceStyle = danceStyle;
    }
    public void displayDetails(){
        System.out.println("Dancer's Info: ");
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
        System.out.println("Dance Style: " + danceStyle);
    }
}
