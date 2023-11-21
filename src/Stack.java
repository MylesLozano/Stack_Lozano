import java.util.Arrays;

public class Stack {
    private String[] arr;
    private int top, capacity;

    public Stack(){
        top=-1;
        arr=new String[10];
    }
    public Stack(int capacity){
        top=-1;
        this.capacity=capacity;
        arr=new String[capacity];
    }

    public boolean isEmpty(){ return top<=-1;}
    public boolean isFull(){ return top>=capacity-1;}

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        arr=new String[capacity];
    }

    public int getCapacity() { return capacity;}
    public void push(String data){
        top++;
        arr[top]=data;
    }
    public String pop(){
        String hold=arr[top];
        top--;
        return hold;
    }
    public String display(){
        String hold="";
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                hold+=arr[i]+" ";
            }
        } else hold="Stack is empty";
        return hold;
    }
    public String elements(){ return Arrays.toString(arr);}
    public int remaining(){ return capacity-(top+1);}
}
