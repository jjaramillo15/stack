package data.sctructure;

public class MyStack<T> {
    private T [] data;
    private int stackIndex;
    
    
    public MyStack() {
        data = (T []) new Object[1000];
        stackIndex = 0;
    }
    
    public void push(T item) {
        data[stackIndex++] = item;
    }
    
    public T pop() {
        if(stackIndex == 0) {
            throw new IllegalStateException("No hay mas elementos en el stack");
        }
        
        return data[--stackIndex];
    }
    
    public boolean contains(T item) {
        boolean found = false;
        
        for (int i = 0; i < stackIndex; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        
        return found;
    }
    
    public T access(T item) {
        while(stackIndex > 0) {
            T tmp = pop();
            if (item.equals(tmp)) {
                return tmp;
            }
        }
        
        throw new IllegalArgumentException("No se encontro el item en el stack: " + item);
    }
    
    public int size() {
        return stackIndex;
    }
    
    public boolean isEmpty() {
        return stackIndex == 0;
    }
    
    public T peek() {
        return data[stackIndex];
    }
}
