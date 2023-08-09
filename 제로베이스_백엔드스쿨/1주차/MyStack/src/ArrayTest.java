import java.util.*;
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = arr.clone();
        int[] arr3 = arr;

        arr[0] = 4;

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));

        System.out.println(Arrays.binarySearch(arr, 2));
    }
}
