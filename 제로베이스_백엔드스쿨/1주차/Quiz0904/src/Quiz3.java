import java.util.Scanner;

public class Quiz3 {
    /*
    * 우현
    * 과제 3
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("전체 게시글 수 : ");
        long totalCount = Long.parseLong(sc.nextLine());
        System.out.print("한 페이지당 보여지는 글의 수 : ");
        long limitCount = Long.parseLong(sc.nextLine());
        System.out.print("페이지네비게이션 블럭수 : ");
        long blockCount = Long.parseLong(sc.nextLine());
        System.out.print("현재 페이지 번호 : ");
        long pageIndex = Long.parseLong(sc.nextLine());

        Pager pager = new Pager(totalCount, limitCount, blockCount);

        System.out.println("<a href=\'#\'>[처음]</a>");
        System.out.println("<a href=\'#\'>[이전]</a>\n");
        System.out.println(pager.html(pageIndex));
        System.out.println("<a href=\'#\'>[다음]</a>");
        System.out.println("<a href=\'#\'>[마지막]</a>");
    }

    public static class Pager{
        long totalCount;
        long limitCount;
        long blockCount;
        long pageCount;

        public Pager(long totalCount, long limitCount, long blockCount) {
            this.totalCount = totalCount;
            this.limitCount = limitCount;
            this.blockCount = blockCount;
            this.pageCount = totalCount % limitCount == 0 ? totalCount / limitCount : totalCount / limitCount + 1;
        }

        public String html(long pageIndex){
            String s = "";

            long start = (pageIndex % this.blockCount == 0) ? (pageIndex / this.blockCount - 1) * this.blockCount + 1
                                                            : (pageIndex / this.blockCount) * this.blockCount + 1;

            for(long i = start; i < start + blockCount; i++){
                if(i > pageCount){
                    break;
                }

                if(i == pageIndex){
                    s += "<a href=\'#\' class=\'on\'>" + Long.toString(i) + "</a>\n";
                }else{
                    s += "<a href=\'#\'>" + Long.toString(i) + "</a>\n";
                }
            }

            return s;
        }
    }
}
