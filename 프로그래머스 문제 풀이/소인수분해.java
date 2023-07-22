import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int check = 0;
        for (int i = 2; i < 10000; i++){
            check = 0;
            for(int j = 2; j <= i; j++){
                if (i % j == 0){
                    check++;
                }
                if(check > 1){
                    break;
                }
            }
            if (check == 1){
                array.add(i);
            }
        }
        for (int i = 0; i < array.size(); i++){
            if (array.get(i) > n) break;
            if(n % array.get(i) == 0){
                answer.add(array.get(i));
            }
        }
        
        return answer;
    }
}