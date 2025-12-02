public class LinkedListStack {
    private NodeLinkedListStack top;

    public LinkedListStack() {
        this.top = null;
    }

    // isEmpty : Check whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // push : insert an element into the stack
    public void push(int data) {
        NodeLinkedListStack newNode = new NodeLinkedListStack(data);
        newNode.next = top;
        top = newNode;
    }

    // pop : remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!");
            return -1;
        }
        int value = top.data;
        top = top.next; 
        return value;
    }

    // peek :- returns the top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!!"); // FIXED
            return -1;
        } else {
            return top.data;
        }
    }

    // display
    public void display(){
        if (isEmpty()){
            System.out.println("Stack is empty!!");
            return;
        }else{
            NodeLinkedListStack temp = top;
            while (temp!=null){
                System.out.println(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();

        }
    }
}
