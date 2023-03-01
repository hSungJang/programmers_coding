package dataStructure.practice.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : NotExistNumber
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class NotExistNumber {


    public static void main(String[] args) {
        NotExistNumber nn = new NotExistNumber();
        System.out.println(nn.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] existNumber = new boolean[10];

        for (int i=0 ; i<numbers.length ; i++) {
            existNumber[numbers[i]] = true;
        }

        for (int i=0 ; i<existNumber.length ; i++) {
            if (!existNumber[i]) answer += i;
        }
        return answer;
    }
}
