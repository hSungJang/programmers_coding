package dataStructure.basic.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : BasicString
 * author         : janghyoseong
 * date           : 2023/02/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/06        janghyoseong       최초 생성
 */
public class BasicString {


    public static void main(String[] args) {
        BasicString bs = new BasicString();
        System.out.println(bs.solution("124"));
    }
    public boolean solution(String s) {
        if (!(s.length() >= 4 && s.length() <= 6)) return false;
        return s.chars().allMatch(Character::isDigit);
    }
}
