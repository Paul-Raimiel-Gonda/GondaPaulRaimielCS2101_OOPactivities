public class Singer extends Artist {
    private String genre;

    public Singer(String name, int age, String specialty, String genre){
        super(name, age, specialty);
        this.genre = genre;
    }
    public void displayDetails(){
        System.out.println("Singer's Info: ");
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
        System.out.println("Genre: " + genre);
    }
}
