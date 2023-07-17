class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        int a, b, c;
        a = slicer[0];
        b = slicer[1];
        c = slicer[2];
        
        switch(n){
            case 1:
                answer = new int[b + 1];
                for (int i = 0; i < b + 1; i++){
                    answer[i] = num_list[i];
                }
                break;
            case 2:
                answer = new int[num_list.length - a];
                for (int i = 0; i < num_list.length - a; i++){
                    answer[i] = num_list[a + i];
                }
                break;
            case 3:
                answer = new int[b - a + 1];
                for (int i = 0; i < b - a + 1; i++){
                    answer[i] = num_list[i + a];
                }
                break;
            case 4:
                int count = 0;
                for (int i = a; i <= b; i += c) {
                    count++;
                }
                answer = new int[count];
                count = 0;
                for (int i = a; i <= b; i += c) {
                    answer[count] = num_list[i];
                    count++;
                }
                break;
            default:
                answer = new int[0];
                break;
        }
        return answer;
    }
}
