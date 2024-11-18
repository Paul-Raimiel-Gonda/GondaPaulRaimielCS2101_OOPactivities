public class Singer extends Artist {
    private Genre genre;

    public Singer(String name, int age, String specialty, Genre genre){
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
