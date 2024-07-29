public class PracticeSubLinked {

    class Node{
        int data;
        Node next;

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

    public void reverse(int start, int end){

        if(head==null || start>=end){
            return;
        }

        Node dummy=new Node(0);
        dummy.next=head;
        Node nodeBeforeSub=dummy;

        for(int i=0;i<=start-2;i++){
            nodeBeforeSub=nodeBeforeSub.next;
        }

        Node workingPointer=nodeBeforeSub.next;
        Node nodeToBeExtracted=workingPointer.next;

        for(int i=0;i<end-start;i++){
            nodeToBeExtracted=workingPointer.next;
            workingPointer.next=nodeToBeExtracted.next;
            nodeToBeExtracted.next=nodeBeforeSub.next;
            nodeBeforeSub.next=nodeToBeExtracted;
        }

        if(start==1){
            head=dummy.next;
        }
    }

    public void display(){
        Node current=head;
        if(current==null){
            System.out.println("Empty Linkedlist");

        }
        while (current!=null) {
            System.out.print(current.data);
            System.out.print("-->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public static void main(String[] args) {
        PracticeSubLinked plinked=new PracticeSubLinked();
        plinked.add(10);
        plinked.add(20);
        plinked.add(30);
        plinked.add(40);

        plinked.display();
        plinked.reverse(1, 4);
        plinked.display();
    }
    
}
