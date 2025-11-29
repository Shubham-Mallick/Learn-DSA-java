public class SingleQueue {
    private int [] queue;
    private int front ;
    private int rear ;
    private int capacity ;

    public SingleQueue(int capacity){
        this.capacity = capacity;
        this.queue = new int [capacity];
        this.front = 0;
        this.rear = -1;

    }

    // Enqueue operation :- to add an element to the queue
    public void  enqueue(int value){
        if (rear==capacity-1){
            System.out.println("Queue is full");
        }else{
            rear ++;
            queue[rear] = value;
            System.out.println(value + " is added to Queue ");

         }
    }

    // Dequeue operation :- to remove element from the Queue
    public int dequeue(){
        if (front > rear){
            System.out.println("Queue is Empty !!");
            return -1;
         }else{
            int data = queue[front];
            front++;
            return data;
         }
    }

    // peek :- present front element
    public int peek(){
        if (front>rear){
            System.out.println("Queue is Empty!!");
            return -1;
        }else{
            return queue[front];
        }
    }

    // print data
    public void display() {
    if (front > rear) {
        System.out.println("Queue is Empty!!");
    } else {
        System.out.println("Queue :-");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "\t");
        }
        System.out.println();
    }
}

}
