package dataStructure.basic.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : Mod1Number
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class Mod1Number {


    public static void main(String[] args) {
        Mod1Number mn = new Mod1Number();
        System.out.println(mn.solution(10));
    }


    public int solution(int n) {
        int answer = 0;
        for (int i=2 ; i<n ; i++) {
            int mod = n%i;
            if (mod == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
