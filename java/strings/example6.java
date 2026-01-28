package strings;

public class example6 {

    public static void main(String[] args) {
        String text = "  2tewo  pj88j45 many  careless  is not   ok  ";
        String words[] = text.split("\\s+");
        for (String word : words) {
            System.out.println(word.replaceAll("[^a-zA-Z]", ""));
        }
    }
}
