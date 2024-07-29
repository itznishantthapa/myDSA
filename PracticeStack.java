public  class PracticeStack{

   private int size;
    private int stack[];
    private int pointer;

    PracticeStack(int size){
        this.size=size;
        this.stack=new int[size];
        this.pointer=-1;
    }

    public void push(int data){

        if(pointer==size-1){
            System.out.println("Stack overflow");
            return;
        }

        pointer++;
        stack[pointer]=data;
    }

    public int pop(){
        if(pointer==-1){
            return -1;
        }

        int returnValue=stack[pointer];
        pointer--;
        return returnValue;

    }

    public boolean isEmpty(){
        return pointer==-1;
    }

    public void display(){
        if(pointer==-1){
            System.out.print("Stack is empty");
            return;
        }

        for(int i=0;i<=pointer;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PracticeStack s=new PracticeStack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(40);

        s.display();
      System.out.println(s.isEmpty());
    }
    
}
