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

    public enum Genre {
        POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
    }

    public enum Medium {
        OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
    }

    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    public enum DanceStyle {
        BALLET, HIPHOP, JAZZ, CONTEMPORARY
    }
}

