import java.util.*;
import java.util.LinkedList;

class Main {
    public static int size = 0;
    public static boolean[] visited;
    public static int[] parent;
    public static ArrayList<Integer>[] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        size = Integer.parseInt(sc.nextLine());
        visited = new boolean[size + 1];
        visited[1] = true;
        parent = new int[size + 1];
        list = new ArrayList[size + 1];
        for(int i = 0; i <= size; i++){
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < size - 1; i++){
            String[] s = sc.nextLine().split(" ");

            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            list[x].add(y);
            list[y].add(x);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

        while(!queue.isEmpty()){
            int pa = queue.poll();

            for(int su : list[pa]){
                if(!visited[su]){
                    parent[su] = pa;
                    queue.offer(su);
                    visited[su] = true;
                }else {
                    continue;
                }
            }
        }

        for(int i = 2; i <= size; i++){
            System.out.println(parent[i]);
        }
    }
}
