public class ArrayStack {

    private  int top;
    private  int stack[];
    private int size;

    // constructor
    public ArrayStack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }

    public void push(int data) {

        if (top == size-1) {

            System.out.println("Stack is full");

        } else {
            top++;
            stack[top] = data;
        }

    }

    public int pop() {
        if (top == -1) {
           return -1;
        } else {
            int poppedValue=stack[top];
            top--;
            return poppedValue;
        }
       
    }

    public void display(){

        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{

            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }

    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
    }

}
