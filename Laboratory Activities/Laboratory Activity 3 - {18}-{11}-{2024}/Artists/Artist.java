public abstract class Artist {
    protected String name;
    protected int age;
    protected String specialty;

    public Artist(String name, int age, String specialty){
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }
    public abstract void displayDetails();
}
