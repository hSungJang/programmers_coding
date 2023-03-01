package dataStructure.practice.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : NumberDigit
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class NumberDigit {

    public static void main(String[] args) {
        NumberDigit dt = new NumberDigit();
        System.out.println(dt.solution(987));
    }

    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            int mod = n%10;
            n = n/10;
            answer += mod;
        }

        return answer;
    }
}
