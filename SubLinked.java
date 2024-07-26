public class SubLinked{
    class Node{
        int data;
        Node next;

        //Constructor
        Node(int data){
            this.data=data;
            this.next=null;

        }

    }

    Node head=null;
    Node tail=null;

    public void add(int data){

        Node newNode=new Node(data);

        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void display(){
        Node current=head;
        if(current==null){
            System.out.println("Linked List is Empty");
            return;
        }
        while (current!=null) {
            System.out.print(current.data);
            System.out.print("-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node jumper=head;
        Node pointer=head;
        Node previous=null;

        while(jumper!=null){
            jumper=jumper.next;
            pointer.next=previous;

            previous=pointer;
            pointer=jumper;
           
        }

        head=previous;
    }

    public void subReverse(int start,int end){

        if(head==null || start>=end){
            return;
        }

        Node dummy= new Node(0);
        dummy.next=head;
        Node nodeBeforeSub=dummy;


        //placing the pointer to the node which is before the target sublist
        for(int i=0;i<=start-2;i++){
            nodeBeforeSub=nodeBeforeSub.next;
        }

        Node workingPtr=nodeBeforeSub.next;
        Node nodeToBeExtracted=workingPtr.next;

        for(int i=0;i<end-start;i++){

            nodeToBeExtracted=workingPtr.next;
            workingPtr.next=nodeToBeExtracted.next;
            nodeToBeExtracted.next=nodeBeforeSub.next;
            nodeBeforeSub.next=nodeToBeExtracted;
        }
        if(start==1){
            head=dummy.next;
        }
    }

    public static void main(String[] args) {
        SubLinked list= new SubLinked();

        list.add(5);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(12);

        list.display();
        // list.reverse();
        // list.display();

        list.subReverse(2, 3);
        list.display();
    }
}
