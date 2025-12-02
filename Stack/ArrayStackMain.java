public class ArrayStackMain {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.display();
        arrayStack.push(100);
        arrayStack.push(200);
        arrayStack.display();
        arrayStack.pop();
        arrayStack.display();
    }
}
