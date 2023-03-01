package dataStructure.basic.lvl2;

/**
 * packageName    : dataStructure.basic.lvl2
 * fileName       : JadenCase
 * author         : janghyoseong
 * date           : 2023/02/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/06        janghyoseong       최초 생성
 */
public class JadenCase {

    /**
     * s 조건
     * 숫자는 단어의 첫 문자로만 나옵니다.
     * 숫자로만 이루어진 단어는 없습니다.
     * 공백문자가 연속해서 나올 수 있습니다.
     */

    public static void main(String[] args) {
        JadenCase jc  = new JadenCase();
        System.out.println(jc.solution("A Aa  Aaa  aaa  "));
    }

    public String solution(String s) {
        String answer = s + "@";

        String [] words = answer.split(" ");
        // thread-safe
        StringBuffer sb = new StringBuffer();

        for (int i=0 ; i<words.length ; i++) {
            if (i != 0) sb.append(" ");
            if (words[i].equals("") || words[i].equals(" ")) { // 공백문자 케이스
            } else if (Character.isDigit(words[i].charAt(0))) { // 첫째자리 숫자 케이스
                sb.append(words[i].toLowerCase());
            } else { // 그외 정상적인 문자 케이스
                String upper = (words[i].charAt(0)+"").toUpperCase();
                words[i] = words[i].toLowerCase();
                words[i] = words[i].replaceFirst(words[i].charAt(0)+"", upper);
                sb.append(words[i]);
            }
        }

        return sb.toString().replace("@","");
    }
}
