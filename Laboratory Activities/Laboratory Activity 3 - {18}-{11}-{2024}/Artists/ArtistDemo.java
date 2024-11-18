public class ArtistDemo {
    public static void main(String[] args){
        Singer singer = new Singer("Thom Yorke", 56, "Music", "Art Rock");
        Dancer dancer = new Dancer("Jabbawockeez", 19, "Dance", "Hip-Hop");
        Painter painter = new Painter("Gustav Klimt", 55, "Painting", "Art Nouveau");
        Writer writer = new Writer("Fyodor Dostoevsky", 59, "Literature", "Existential Fiction" );

        Artist[] artists = {singer, dancer, painter, writer};

        for (Artist artist : artists) {
            artist.displayDetails();
            System.out.println();
        }
    }
}
