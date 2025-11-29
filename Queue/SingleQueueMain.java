public class SingleQueueMain {
    public static void main(String[] args) {
        SingleQueue singleQueue = new SingleQueue(10);
        singleQueue.display();
        singleQueue.enqueue(100);
        singleQueue.enqueue(200);
        singleQueue.enqueue(300);
        singleQueue.display();
        singleQueue.dequeue();
        singleQueue.display();
    }
}
