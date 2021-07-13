import java.util.*;

public class BinarySearch {
    static boolean binarySearch(int a[], int x, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = (left + right) / 2;
        if (a[mid] == x) {
            return true;
        } else if (x < a[mid]) {
            return binarySearch(a, x, left, mid - 1);
        } else {
            return binarySearch(a, x, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 5, 2, 2342, 3 };
        int find = 5;
        Arrays.sort(a);
        System.out.println(binarySearch(a, find, 0, a.length - 1));
    }
}