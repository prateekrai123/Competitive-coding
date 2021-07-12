public class Stack {
    int max = 1000;
    int top = -1;
    int a[] = new int[max];
  
    //push method
    public void push(int val) {
        if (top == max - 1) {
            System.out.println("Space full");
        }
        top++;
        a[top] = val;
    }

    //pop method
    public int pop() {
        int val = a[top];
        top--;
        return val;
    }

    //peek method
    public int peek() {
        return a[top];
    }

    //isEmpty method
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
