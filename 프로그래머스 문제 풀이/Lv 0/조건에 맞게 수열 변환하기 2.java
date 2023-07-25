import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = Arrays.copyOfRange(arr, 0, arr.length);
        boolean check = false;
        int j = 0;
        while(!check){
            for (int i = 0; i < arr.length; i++){  
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] = arr[i] / 2;
                }else if (arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = (arr[i] * 2) + 1;
                }
            }    
            if (Arrays.equals(arr, arr2)){
                answer = j;
                check = true;
                break;
            }
            j++;
            arr2 = Arrays.copyOfRange(arr, 0, arr.length);
        }
        
        return answer;
    }
}