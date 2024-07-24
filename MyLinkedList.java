public class MyLinkedList{

    static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }



    static Node head=null;
    static Node tail=null;

    public static void add(int data){ 

        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }

    }

    public static void reverse(){
       
        Node jumper=head;
        Node pointer=head;
        Node attractent=null;

        while(jumper!=null){
            jumper=jumper.next;
            pointer.next=attractent;

            attractent=pointer;
            pointer=jumper;
        }
        head=attractent;
    }

    public static void display(){
        Node current=head;

        if(current==null){
            System.out.println("List empty");
            return;
        }
        else{
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);

        display();

        reverse();
        display();

        
    }


}