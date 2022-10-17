class MyCircularDeque {
    int[] que;
    int front;
    int rear;
    int size;
    public MyCircularDeque(int k) {
        front=k-1;
        que= new int[k];
        
    }
    
    public boolean insertFront(int value) {
        if(!isFull()){
            que[front]=value;
            front=(front-1+que.length)%que.length;
            size++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean insertLast(int value) {
        if(!isFull()){
            que[rear]=value;
            rear=(rear+1)%que.length;
            size++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean deleteFront() {
        if(!isEmpty()){
            front=(front+1)%que.length;
            size--;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deleteLast() {
        if(!isEmpty()){
            rear=(rear-1+que.length)%que.length;
            size--;
            return true;
        }else{
            return false;
        }
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        else return que[(front+1)%que.length];
       
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        else return que[(rear-1+que.length)%que.length];

    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==que.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
