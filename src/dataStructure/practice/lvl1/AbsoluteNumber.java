package dataStructure.practice.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : AbsoluteNumber
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class AbsoluteNumber {


    public static void main(String[] args) {
        AbsoluteNumber ab = new AbsoluteNumber();
        System.out.println(ab.solution(new int []{4,7,12}, new boolean[]{true, false, true}));
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i=0 ;i<absolutes.length ; i++) {
            int sign = 1;
            if (!signs[i]) sign = -1;
            answer += (absolutes[i] * sign);
        }

        return answer;
    }
}
