package dataStructure.basic.lvl2;

import java.util.LinkedList;
import java.util.List;

public class WordPress {
//    public static void main(String[] args) {
//        String msg = "KAKAO";
//        System.out.println(solution(msg));
//    }

    public static int[] solution(String msg) {
        List<String> dict = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        int[] answer = {};
        boolean check = false;
        char [] word = msg.toCharArray();
        // 글자 포함 체크
        // 색인번호 26, A = 65 - 64

        while (!check) {
            int index = 0;
            String w = word[index] + "";
            String c = word[index + 1] + "";

            break;
        }

        return answer;
    }
}
