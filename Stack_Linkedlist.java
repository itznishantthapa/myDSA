public class Stack_Linkedlist {

    class Node{
        int data;
        Node next;

        //contructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node top =null;

    public void push(int data){

        Node newNode = new Node(data);

        newNode.next=top;
        top=newNode;

    }

    public void pop(){

        if (top==null){
            System.out.println("Stack is empty");
            return;
        }
        top = top.next;

    }

    public void display(){
        Node current = top;

        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        while(current!=null){
            System.out.println(current.data);
            current=current.next;

        }
    }

    public static void main(String[] args) {
        Stack_Linkedlist stack = new Stack_Linkedlist();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
    }



    
}
