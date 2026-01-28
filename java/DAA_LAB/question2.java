import java.util.*;

public class question2 {
    public static int [] replace(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
        if(arr[i]%2==0) {
            arr[i]=0;
        }
        else {
            arr[i]=1;
        }
           
       }
       Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int length= sc.nextInt();
        int[] arr= new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();      
        }
            int [] result=replace(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(result[i]);    
        // }
       
         System.out.println("replace value :" + Arrays.toString(result));
    }
}

