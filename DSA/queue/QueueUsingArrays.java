package queue;

public class QueueUsingArrays {
    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        queue.display();

        queue.deQueue();
        queue.display();
    }
}

class QueueImplementation{
    int front = 0;
    int rear = 0;
    int[] arr;
    int size;
    public QueueImplementation(int size){
        this.size = size;
        arr = new int[this.size];
    }

    public boolean isEmpty(){
        return (front == 0 && rear == 0);
    }

    public boolean isFull(){
        return (rear == size);
    }

    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue OverFlow \n");
            return;
        }
        arr[rear] = data;
        rear++;
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("Queue UnderFlow");
            return;
        }
        for(int i = front; i < rear; i++){
            arr[i] = arr[i + 1];
        }
    }

    public void display(){
        for(int i = front; i <= rear; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

}
