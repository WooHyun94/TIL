class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int check = 0;
        for (String di : dic){
            check = 0;
            for(String sp : spell){
                if(di.contains(sp)) check++;
            }
            if(check == spell.length){
                System.out.println(di);
                return 1;
            }
        }
        return answer;
    }
}