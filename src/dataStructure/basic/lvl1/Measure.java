package dataStructure.basic.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : Measure
 * author         : janghyoseong
 * date           : 2023/02/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/06        janghyoseong       최초 생성
 */
public class Measure {

    public static void main(String[] args) {
        Measure ms = new Measure();
        System.out.println(ms.solution(13, 17));
    }

    // 약수의 갯수 짝수 + , 반대는 -
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left ; i<=right ; i++)  {
            answer += this.countingMeasure(i);
        }
        return answer;
    }

    public int countingMeasure(int target) {
        int cnt = 0;

        for (int i=1; i <= target ; i++) {
            if (target%i == 0) cnt ++;
        }

        if (cnt%2 == 0) return target;
        else return (target * -1);
    }
}
