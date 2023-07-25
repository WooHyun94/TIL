class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sizeCheck = 0;
        if (arr1.length > arr2.length){
            answer = 1;
        }else if (arr1.length < arr2.length){
            answer = -1;
        }else{
            sizeCheck = 1;
        }
        if (sizeCheck == 1){
            int sumArr1 = 0;
            int sumArr2 = 0;
            for (int i = 0; i < arr1.length; i++){
                sumArr1 += arr1[i];
                sumArr2 += arr2[i];
            }
            if (sumArr1 > sumArr2){
                answer = 1;
            }else if (sumArr1 < sumArr2){
                answer = -1;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}