import java.util.*;

/*
* 우현
* 과제 2
* */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나의 좌표를 입력해주세요.(예 : \"x y\") : ");
        String[] s = sc.nextLine().split(" ");
        Coordinate now = new Coordinate(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        ArrayList<String> li = new ArrayList<>();

        while(li.size() < 10){
            System.out.print("현재 입력개수 : " + Integer.toString(li.size()) +  " 임의의 좌표를 입력해주세요.(예 : \"x y\") : ");
            String input = sc.nextLine();
            boolean check = false;
            for(int i = 0; i < li.size(); i++){
                if(li.get(i).equals(input)){
                    check = true;
                    break;
                }
            }
            if(!check){
                li.add(input);
            }
        }

        Coordinate[] coordinates = new Coordinate[10];


        for(int i = 0; i < li.size(); i++){
            s = li.get(i).split(" ");
            coordinates[i] = new Coordinate(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }

        int x = 0, y = 0;
        double minDistance = Double.MAX_VALUE;

        for(int i = 0; i < coordinates.length; i++){
            double distance = now.distance(coordinates[i]);

            if(minDistance > distance){
                minDistance = distance;
                x = coordinates[i].x;
                y = coordinates[i].y;
            }
        }

        System.out.printf("나와 가장 가까운 좌표값은 (%d, %d) 입니다.", x, y);
    }

    public static class Coordinate{
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distance(Coordinate o){
            int disX = Math.abs(this.x - o.x);
            int disY = Math.abs(this.y - o.y);

            return Math.sqrt(Math.pow(disX, 2) + Math.pow(disY, 2));
        }
    }
}