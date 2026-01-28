package strings;

public class example5 {

    public static void main(String[] args) {
        String text = "  too   many  careless  is not   ok  ";
        String words = text.trim().replaceAll("\\s+", " ");
        // for (String word : words) {
        System.out.println(words);

    }

}
