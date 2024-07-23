class QueueArray {

     class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }

    Node front=null;
    Node rare=null;

    public void enqeue(int data ){
        Node newNode= new Node(data);

        if(front==null && rare==null){
            front=newNode;
            rare=newNode;
            return;
        }
          rare.next= newNode;
          rare=newNode;
    }

    public void deqeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        front=front.next;
    }

    public void display(){
        if(front==null){
            System.out.println("Empty");
            return;
        }
        Node current= front;
        while(current!=null){
                System.out.println(current.data);
                current=current.next;
        }
    }

    public static void main(String[] args) {
        QueueArray queue= new QueueArray();

        queue.enqeue(10);
        queue.enqeue(20);
        queue.enqeue(30);

        queue.display();

        queue.deqeue();

        System.out.println("After deqeue");
        queue.display();


    }
}
