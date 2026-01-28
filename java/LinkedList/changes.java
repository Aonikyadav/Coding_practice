package LinkedList;



public class changes{
    public static class Node {
        int data;
        Node next ;
            Node(int data) {
                this.data = data;
            }
        }
        public static class LinkedList {
            Node head = null;
            Node tail = null;


            void insertAtEnd(int value) {

            Node temp = new Node (value);
            
            if (head == null) {
                head = temp;
            }

            else  {
                tail.next = temp;
            }
            tail = temp;
            }


            void display() { // joining the node to the next node (join one node to another node)
                Node temp = head;
                while(temp!=null) {
                    System.out.print(temp.data +" ");
                    temp = temp.next;
                }
                System.out.println();
            }


            void insertAt(int idx,int val) { //inserting new value b/w the any node 
                Node t = new Node(val);
                Node temp = head;
                for(int i=1;i<=idx-1;i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }


            int getAt(int indx) {  //it gaves the index of the value
                Node temp = head;
                for(int i=1 ; i<=indx ; i++) {
                    temp=temp.next;
                }
                return temp.data;
            }
 
        }
        
        
        public static void main(String[] args) {

        //      LinkedList linkedlist = new LinkedList();

        // try (Scanner scanner = new Scanner(System.in)) {
        //     int n = scanner.nextInt();
        //     for(int i=0 ; i<n ; i++) {
        //         int element = scanner.nextInt();
        //         linkedlist.insertAtEnd(element);
        //     }

            LinkedList x = new LinkedList();
            x.insertAtEnd(4);
            x.insertAtEnd(5);
            x.insertAtEnd(12);
            x.insertAtEnd(13);
            x.display();

            x.insertAt(0,39);
            x.display();
            System.out.println(x.getAt(3));

            // linkedlist.display();

            // linkedlist.insertAt(0,39);
            // linkedlist.display();

            // // System.out.println();
            // System.out.println(linkedlist.getAt(3));
        }
             }
