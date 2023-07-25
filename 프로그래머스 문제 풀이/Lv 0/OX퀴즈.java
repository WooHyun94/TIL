class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        boolean check = true;
        int i = 0;
        for(String q : quiz){
            String[] s = q.split(" ");
            switch(s[1]){
                case "+":
                    check = Integer.parseInt(s[0]) + Integer.parseInt(s[2]) == Integer.parseInt(s[4]) ? true : false;
                    break;
                case "-":
                    check = Integer.parseInt(s[0]) - Integer.parseInt(s[2]) == Integer.parseInt(s[4]) ? true : false;
                    break;
            }
            
            answer[i] = check ? "O" : "X";
            i++;
        }
        return answer;
    }
}