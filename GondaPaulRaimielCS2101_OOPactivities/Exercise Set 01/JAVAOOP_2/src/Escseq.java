public class Escseq {
    public static void main(String[] args) {
        boolean addTab = false;

        for (int i = 1; i <= 10; i++) {
            int multiple = i * 7;
            if (addTab) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }
            addTab = !addTab;
        }
    }
}
