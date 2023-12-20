import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        MyStack jmj = new MyStack();
        jmj.push(8);

        System.out.println( jmj.getSize());

    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(getSize() - 1);
    }

    public Object pop(){
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o){
        list.add(0);
    }

    @Override
    public String toString(){
        return "stack: " + list.toString();
    }
}
