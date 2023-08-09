import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int i = arr[arr.length - 1];
        boolean check = false;
        Loop:
        while (true){
            check = true;
            for (int j = 0; j < arr.length; j++){
                if (i % arr[j] != 0) {
                    check = false;
                    break;
                }
            }
            if(check == true) return i;
            i++;
        }
    }
}