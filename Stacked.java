public class Stacked {

    class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node top=null;

    public void push(int data){
        Node newNode=new Node(data);

        newNode.next=top;
        top=newNode;
    }

    public void display(){
        Node current=top;
        while (current !=null) {

            System.out.print(current.data+"-->");
            current=current.next;
            
        }
        System.out.println("null");
    }

    public int pop(){
        int value=top.data;
        top=top.next;
        return value;
        
    }

    public static void main(String[] args) {
        Stacked stack= new Stacked();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        

        stack.display();

        stack.pop();

        stack.display();
    }
    
}
