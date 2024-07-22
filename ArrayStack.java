public class ArrayStack{

    static int n =5;
    static int[] queue = new int[n];
    static int front = -1;
    static int rare = -1;


    public static void enqueue(int x){

        if(rare==n-1){

            System.out.println("Queue is overflow");
        }
        else if(front==-1 && rare==-1){

            front=0;
            rare=0;

            queue[rare]=x;

        }
        else{
            rare++;
            queue[rare]=x;
        }
        
    }

    public static void dequeue(){

        if(front==1 && rare==-1){
            System.out.println("Queue is empty");
        }
        else if(front==rare){

            front=-1;
            rare=-1;
        }
            
        else{
            front++;
        }

    }

    //this is extra method added for dequeue all the queue elements
    public static void dequeueAll(){
        if(front==-1 && rare==-1){
            System.out.println("Queue is empty");
        }
        else{
            front=-1;
            rare=-1;
        }
    }

    public static void peek(){
        if(front==-1 && rare==-1){
            System.out.println("Queue is empty");
    }
    else{
        System.out.println(queue[front]);
    }
}

public static void display(){
    if (front==-1 && rare==-1){
        System.out.println("Queue is empty");
    }
    else{
        for (int i=front;i<=rare;i++){
            System.out.println(queue[i]);
        }
    }
}



public static void main(String[] args) {

    enqueue(1);
    enqueue(2);
    enqueue(4);
    enqueue(6);
    enqueue(9);

    display();

    System.out.println("This is peek of the queue: ");
    peek();

    dequeueAll();

    System.out.println("After deleteing");
    display();

    enqueue(6);
    enqueue(9);


    System.out.println("after adding the two");
    display();
    // peek();

    


}



}