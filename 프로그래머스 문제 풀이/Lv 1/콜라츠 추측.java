class Solution {
    public int solution(int nu) {
        int answer = 0;
        int check = 0;
        long num = nu;
        while (num != 1){
            if (check == 500) return -1;
            if(num == 0) num++;
            else if(num % 2 == 0) num /= 2;
            else num = (num * 3) + 1;
            System.out.println(num);
            check++;
        }
        answer = check;
        return answer;
    }
}