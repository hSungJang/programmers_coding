package dataStructure.practice.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : PAndYCount
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class PAndYCount {

    public static void main(String[] args) {
        PAndYCount py = new PAndYCount();
        System.out.println(py.solution("Pyy"));
    }
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int p = 0;
        int y = 0;

        for (int i=0 ; i<s.length() ; i++) {
            char val = s.charAt(i);
            if (val == 'p') p++;
            else if (val == 'y') y++;
        }

        return p == y;
    }
}
