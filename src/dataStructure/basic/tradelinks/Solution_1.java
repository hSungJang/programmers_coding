package dataStructure.basic.tradelinks;

/**
 * packageName    : dataStructure.basic.tradelinks
 * fileName       : Solution_1
 * author         : janghyoseong
 * date           : 2023/02/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/17        janghyoseong       최초 생성
 */
public class Solution_1 {

    public static void main(String[] args) {
        Solution_1 s = new Solution_1();
        System.out.println(s.solution(6));
        System.out.println(s.solution(7));
    }


    public long[] solution(long n) {
        // n / 7 = 값 * 2
        // n % 7 = 나머지는 아래의 케이스에 따라 처리
        // 7일이면 무조건 [2,2]
        // 6일이면 [1,2]
        // 2 ~ 5일이면 [0,2]
        // 1 [0,1]

        long []answer = {0,0};
        long min = 0;
        long max = 0;

        long holiday = n / 7;
        long dynamicHoliday = n % 7;

        min = holiday * 2;
        max = holiday * 2;
        if (dynamicHoliday == 6) {
            min += 1;
            max += 2;
        } else if (dynamicHoliday >= 2 && dynamicHoliday <= 5) {
            min += 0;
            max += 2;
        } else if (dynamicHoliday == 1) {
            min += 0;
            max += 1;
        }

        answer[0] = min;
        answer[1] = max;
        return answer;
    }

}
