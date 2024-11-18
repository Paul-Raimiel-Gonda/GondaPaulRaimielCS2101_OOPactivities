public class ArtistDemo {
    public static void main(String[] args){
        Singer singer = new Singer("Thom Yorke", 56, "Music", Artist.Genre.ROCK);
        Dancer dancer = new Dancer("Jabbawockeez", 19, "Dance", Artist.DanceStyle.HIPHOP);
        Painter painter = new Painter("Gustav Klimt", 55, "Painting", Artist.Medium.OIL);
        Writer writer = new Writer("Fyodor Dostoevsky", 59, "Literature", Artist.WritingStyle.FICTION );

        Artist[] artists = {singer, dancer, painter, writer};

        for (Artist artist : artists) {
            artist.displayDetails();
            System.out.println();
        }
    }
}
