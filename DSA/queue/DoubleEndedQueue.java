package queue;

public class DoubleEndedQueue {
    
}

class DEQueue{
    int size;
    int front = 0;
    int rear = 0;
    int[] arr;

    public DEQueue(int size){
        this.size = size;
        arr = new int[this.size];
    }

    protected boolean isEmpty(){
        return (front == 0 && rear == 0);
    }

    protected boolean isFull(){
        return (rear == size);
    }

    protected void insertFirst(){
        if(isFull()){
            System.out.println("Queue OverFlow");
            return;
        }
        

    }

    protected void insertLast(){

    }
    protected void deleteFirst(){

    }
    protected void deleteLase(){}



}
