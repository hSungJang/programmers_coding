package dataStructure.practice.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : XIntervalN
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class XIntervalN {
    public static void main(String[] args) {
        XIntervalN xn = new XIntervalN();
        System.out.println(xn.solution(2, 5).toString());
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i=1 ; i<n ; i++) {
            answer[i] = answer[i-1] + x;
        }

        return answer;
    }

}
