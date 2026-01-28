package dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class DsaLinklist {
    public static void main(String[] args) {
         ArrayList<Integer> l1 = new ArrayList<>();  
         Scanner sc = new Scanner(System.in);
         l1.add(0);  //0
         l1.add(10); //0 10 
         l1.add(9); //0 10 9
         l1.add(8); //0 10 9 8
         l1.add(7); //0 10 9 8 7
         l1.add(6); //0 10 9  8 7 6
        //  System.out.println(l1.get(1)); //10
        //  for(int i =0 ;i<l1.size() ; i++) {
        //     System.out.print(l1.get(i)+" "); //0,10,9,8,7,6
        //  }
        System.out.println("Enter the value of finding the indexOF ");
        int a1=sc.nextInt();
         l1.set(3,27);
         System.out.println(l1);
         l1.add(3,100);
         System.out.println(l1);
         System.out.println(l1.indexOf(a1));
         System.out.println("Enter the Index of removing element");
         int r1=sc.nextInt();
         l1.remove(r1);
         System.out.println(l1);
         l1.remove(Integer.valueOf(6));
         System.out.println(l1);
    }
}
