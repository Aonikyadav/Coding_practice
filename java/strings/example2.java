package strings;

public class example2 {

    public static void main(String[] args) {
        String text = "apple,banana,cherry,dates";
        String[] fruits = text.split(",");

        // Print each fruit  
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
