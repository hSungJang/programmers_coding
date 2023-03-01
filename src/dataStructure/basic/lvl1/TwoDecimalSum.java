package dataStructure.basic.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : TwoDecimalSum
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class TwoDecimalSum {

    public static void main(String[] args) {
        TwoDecimalSum td = new TwoDecimalSum();
        System.out.println(td.solution(5, 3));
    }


    public long solution(int a, int b) {
        long answer = 0;

        int start = a;
        int end = b;
        if (a >= b) {
            start = b;
            end = a;
        }

        for (int i=start ; i<=end ; i++) {
            answer += i;
        }


        return answer;
    }
}
