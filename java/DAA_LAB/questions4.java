import java.util.*;
public class questions4 {

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length / 3;
        int answer = 0;
        int right= piles.length-1;

        for (int i = 0; i < n; i++) {
            right--;
            answer +=piles[right];
            right--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int length= sc.nextInt();
        int[] piles= new int[length];

        for (int i = 0; i < piles.length; i++) {
            piles[i] = sc.nextInt();      
        }
        System.out.println( "maximum coins we get " + maxCoins(piles));
    }
}



// example
// 7
// 5 9 10 12 8 7 20
// maximum coins we get 21