package strings;

public class example3 {

    public static void main(String[] args) {
        String text = "one ,two ,three ,four ,five";
        String words[] = text.split(",", 4);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
