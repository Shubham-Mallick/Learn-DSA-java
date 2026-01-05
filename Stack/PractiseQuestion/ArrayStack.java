public class ArrayStack {
    private char[] array;
    private int size;
    private int top;

    public ArrayStack(int size) {
        this.size = size;
        array = new char[size];
        top = -1;
    }

    // isEmpty : checking whether the stack is empty or not
    public boolean isEmpty() {
        return top == -1;
    }

    // push operation : Adding elements into the Stack
    public void push(char data) {
        if (top == size - 1) {
            System.out.println("Stack is full !!");
            return;
        } else {
            top++;
            array[top] = data;
            System.out.println(data + " is push in the stack ");
        }
    }

    // pop operation : Removing elements from the Stack
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty !!");
            return '\0'; // Return null character for empty stack
        } else {
            char temp = array[top];
            top--;
            System.out.println(temp + " is pop from the Stack ");
            return temp;
        }
    }

    //peek :- return the top elements
    public char peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return '\0';
        }else{
            return array[top];

        }
    }

    // display :- display the elements
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty!!");
        }else{
            System.out.println("Stack :-");
            for(int i=0;i<=top;i++){
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }

    }
}
