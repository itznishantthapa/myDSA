import java.nio.file.NotDirectoryException;

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

        public void add(int index,int data){

            Node newNode=new Node(data);

           
            if(index==0){
                Node exHead=head;
                head=newNode;
                newNode.next=exHead;
                return;

            }

            Node current = head;
            for(int i=0;i<=index-2;i++){
                if(current==null){
                    System.out.println("Index out of the bound");
                    return;
                }

                current=current.next;
            }
            // Node carry=current.next;
            // current.next=newNode;
            // newNode.next=carry;
            // current=newNode;
            newNode.next=current.next;
            current.next=newNode;


        }

        public void display(){
            Node current = head;

            if(head==null){
                System.out.print("LinkedList Empty");
                return;
            }
            System.out.print("head"+"-->");
            while(current!=null){
                System.out.print(current.data);
                System.out.print("-->");
                current=current.next;
            }
            System.out.println("null");

        }

        public static void main(String[] args) {
            Linked_List linkedlist= new Linked_List();
            linkedlist.add(1);
            linkedlist.add(20);
            linkedlist.add(23);

            linkedlist.display();

            linkedlist.add(0, 0);
            linkedlist.add(1, 10);
            linkedlist.add(2, 15);
            linkedlist.display();
        }


    
}
