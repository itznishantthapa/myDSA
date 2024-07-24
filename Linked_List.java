public class Linked_List {
    
    class Node{
       private int data;
       private Node next;

        //constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

        Node head=null;
        Node tail=null;

        public void add(int data){

            Node newNode = new Node(data);

            if(head==null && tail==null){
                head= newNode;
                tail=newNode;
                return;
            }

            tail.next=newNode;
            tail=newNode;
            

        }

        public void display(){
            Node current = head;

            if(head==null){
                System.out.println("LinkedList Empty");
                return;
            }
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }

        }

        public static void main(String[] args) {
            Linked_List linkedlist= new Linked_List();
            linkedlist.add(1);
            linkedlist.add(20);
            linkedlist.add(23);

            linkedlist.display();
        }


    
}
