class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int j;
        int check;
        
        for (int i = 1; i <= Math.sqrt(yellow); i++){
            if (yellow % i != 0) continue;
            else{
                j = yellow / i;
                check = 2 * (j + 2) + (2 * i);
                System.out.println(check);
                if (check == brown){
                    answer[0] = j + 2;
                    answer[1] = i + 2;
                    break;
                }
            }
        }
        return answer;
    }
}
// 24 24 
// 1 * 24 - > (24 + 2) + 2 + (24 + 2) -> 52
// 2 * 12 -> (12 + 2) + 2 + 2 + (12 + 2) -> 32
// 3 * 8 -> 10 + 2 + 2 + 2 + 10 -> 26
// 4 * 6 -> 8 + 2 + 2 + 2 + 2 + 8 -> 24
