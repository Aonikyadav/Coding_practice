package LinkedList;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class userinputin_ll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
           
            array[i] = scanner.nextInt();
        }

        LinkedList linkedList = new LinkedList();
        for (int element : array) {
            linkedList.add(element);
        }

        System.out.println("LinkedList: " + linkedList);
        
              Collections.reverse(linkedList);

        System.out.println("LinkedList: " + linkedList);
    }
}

