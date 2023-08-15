import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon24174 {

    public static void heapSort(int[] A, int n, int a) {
        buildMinHeap(A, n);

        if (a >= n) {
            System.out.println("-1");
            return;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (a <= 0) {
                break;
            }

            swap(A, 0, i);
            heapify(A, 0, i - 1);
            a--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void buildMinHeap(int[] A, int n) {
        for (int i = n / 2; i >= 0; i--) {
            heapify(A, i, n - 1);
        }
    }

    public static void heapify(int[] A, int k, int n) {
        int left = 2 * k + 1;
        int right = 2 * k + 2;
        int smaller = k;

        if (left <= n && A[left] < A[smaller]) {
            smaller = left;
        }

        if (right <= n && A[right] < A[smaller]) {
            smaller = right;
        }

        if (smaller != k) {
            swap(A, k, smaller);
            heapify(A, smaller, n);
        }
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int a = Integer.parseInt(s[1]);;
        int[] A = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        heapSort(A, n, a);
    }
}
