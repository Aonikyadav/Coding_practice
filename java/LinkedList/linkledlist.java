package LinkedList;


public class linkledlist {

    public static int length(Node head) {
        int count =0;
        while(head!=null) {
            count++;
            head=head.next;
        }
        return count;
    }

    public static void displayreverse(Node head) {  //THIS LINE FOR DISPLAY THE REVERSE NODE DATA
        if (head==null) 
           return;
           displayreverse(head.next);
           System.out.print(head.data +" ");

        }
    

    public static void displaynormal(Node head) {   //THIS LINE FOR DISPLAY THE NORMAL NODE DATA
        while(head!=null) {
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
 
    public static class Node{
        int data;
        Node next;
        Node(int data ) {
            this.data=data;
        }

        public Node() {
        }
    }
    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(100);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // displaynormal(a);
        // System.out.println();
        // displayreverse(a);
        System.out.println("Length of the Linked list:" + length(a));


    }
}
