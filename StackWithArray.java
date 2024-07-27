public class StackWithArray {
    int size;
    int arr[];

    //Constructor
    StackWithArray(int size){
        this.size=size;
        this.arr=new int[size];
    }

    int top=-1;

    public void push(int data){

        if(top==size-1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top]=data;
    }

    public int pop(){
        int value=arr[top];
        top--;
        return value;
    }

    public void display(){
        while (top != -1) {
            System.out.print(arr[top]+"->");
            top--;
        }
    }

    public static void main(String[] args) {
        StackWithArray stack= new StackWithArray(4);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
    }
    
}
