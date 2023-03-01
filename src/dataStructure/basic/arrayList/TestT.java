package dataStructure.basic.arrayList;

/**
 * packageName    : dataStructure.basic.arrayList
 * fileName       : TestT
 * author         : janghyoseong
 * date           : 2023/01/17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/01/17        janghyoseong       최초 생성
 */
public class TestT {

    public static void main(String[] args) {
        String s = "old man is a babo";
        String w = "a";

        String [] word = s.split(" ");
        int result = 0;
        for (int i=0 ; i<word.length ; i++) {
            if (word[i].equals(w)) {
                result = i+1;
                break;
            }
        }
        System.out.println(result);
    }
}
