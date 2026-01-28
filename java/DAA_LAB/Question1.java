package dsa;
import java.util.*;
public class Question1 {
    // static void reverseList(ArrayList<Integer> list) {
    //     int i=0 , j=list.size()-1 ;
    //     while(i<j) {
    //         Integer temp=Integer.valueOf(list.get(i));
    //         list.set(i , list.get(j));
    //         list.set(j , temp);
    //         i++;
    //         j--;
    //     }
    // }
//     public static void main(String[] args) {

//         ArrayList <Integer> l1 = new ArrayList<>();
//         ArrayList <String> l2 =  new ArrayList<>();
//         // ArrayList l1 = new ArrayList ;
//         Scanner sc = new Scanner(System.in);
//         int indx=sc.nextInt();
//         for(int i=0 ; i<indx; i++) {
//         int val=sc.nextInt();
//         l1.add(val); 
//     } 
//         sc.close();
//         System.out.println("Original Array " + l1);
//         // reverseList(l1);
//         Collections.reverse(l1);
//         System.out.println("Reverse Array " + l1);
//         Collections.sort(l1);
//         System.out.println("Sorted Array " + l1);
//         Collections.sort(l1 , Collections.reverseOrder());
//         System.out.println("Decending order Array " + l1);

//     }
// }



        //ARRAY LIST USING STRING & TAKING INPUT BY USER IN ARRAYLIST

        public static void main(String args[]) {
            ArrayList <String> list2 = new ArrayList <>();
            Scanner sc = new Scanner(System.in);
            int indx=sc.nextInt();
            sc.nextLine();

            for(int i=0 ; i<indx ; i++) {
                String val=sc.nextLine();
                list2.add(val);
            }
            sc.close();

            System.out.println("Orignal String list " + list2 );
            Collections.reverse(list2);
            System.out.println("Reverse an String " + list2);
            Collections.sort(list2);
            System.out.println("Sorted String List " + list2);
            Collections.sort(list2, Collections.reverseOrder());
            System.out.println("Sorted in a Decnding Order " + list2);
        }
    }
