package strings;

public class example4 {

    public static void main(String[] args) {
        String text = "one two apple banana mango roti aloo";
        String words[] = text.split("\\s+");
        System.out.println(words.length);
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
