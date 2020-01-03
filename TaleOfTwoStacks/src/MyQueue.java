import java.util.Stack;

public class MyQueue<T> {
    Stack<T> stackNew = new Stack<>();
    Stack<T> stackOld = new Stack<>();

    public void enqueue(T item){
        stackNew.push(item);
    }
    public T dequeue(){
        if (stackOld.isEmpty()){
            while(!stackNew.isEmpty()){
                stackOld.push(stackNew.pop());
            }
        }
        return stackOld.pop();
    }
    public T peek(){
        if (stackOld.isEmpty()){
            while(!stackNew.isEmpty()){
                stackOld.push(stackNew.pop());
            }
        }
        return stackOld.peek();
    }
}
