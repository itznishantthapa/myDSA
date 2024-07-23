public class LinkedStack {
    
    public class Node{
        public int data;
        public Node next;

        //constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node top=null;

    public void push(int data){
        Node newNode= new Node(data);

        newNode.next=top;
        top=newNode;
    }

    public int pop(){
        if(top==null){
          return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }

    public void display(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        Node current=top;
        while(current!=null){

            System.out.println(current.data);
            current=current.next;
        }

    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

       System.out.println("Popped Items:  "+stack.pop());
       System.out.println("After popped");
       stack.display();
    }
  
}
