import java.util.*;

class Recursion {
    public static void main(String[] args) {

    }

    /* Print factorial of a number using recursion */

    public static int factorial(int a) {
        if (a <= 1) {
            return 1;
        }
        return (a * factorial(a - 1));
    }

    /* Print n numbers using recursion */

    public static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.print(n + " ");
    }

    /* Sort a vector using recursion */

    public static void sort(Vector<Integer> v) {
        if (v.size() == 0)
            return;
        int temp = v.lastElement();
        v.remove(v.lastElement());
        sort(v);
        insert(v, temp);
    }

    public static void insert(Vector<Integer> v, int temp) {
        if (v.size() == 0 || v.lastElement() <= temp) {
            v.add(temp);
            return;
        }
        int val = v.lastElement();
        v.remove(v.lastElement());
        insert(v, temp);
        v.add(val);
    }

    /* Sort a stack using recursion */

    public static void sort(Stack<Integer> s) {
        if (s.size() == 0) {
            return;
        }
        int temp = s.pop();
        sort(s);
        insert(s, temp);
    }

    public static void insert(Stack<Integer> s, int temp) {
        if (s.size() == 0 || s.peek() <= temp) {
            s.push(temp);
            return;
        }
        int val = s.pop();
        insert(s, temp);
        s.push(val);
    }

    /* Delete middle element of a stack */

    public static Stack<Integer> deleteMid(Stack<Integer> s, int k) {
        if (s.size() == 0) {
            return s;
        }
        if (k == 1) {
            s.pop();
            return s;
        }
        int temp = s.pop();
        deleteMid(s, k - 1);
        s.push(temp);
        return s;
    }

}
