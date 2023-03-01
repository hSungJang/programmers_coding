package dataStructure.basic.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : NumberSqrt
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class NumberSqrt {

    public static void main(String[] args) {
        NumberSqrt ns = new NumberSqrt();
        System.out.println(ns.solution(121));

    }

    public long solution(long n) {
        long answer = 0;
        long temp = 0;
        temp = (long) Math.sqrt(n);

        if ((temp * temp) == n ) answer = (temp + 1) * (temp + 1);
        else answer = -1;

        return answer;
    }
}
