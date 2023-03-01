package dataStructure.basic.lvl0;

import java.util.HashMap;
import java.util.Map;

public class AtoB {

    public static void main(String[] args) {

        System.out.println(solution("allpe", "hello"));
    }

    public static int solution(String before, String after) {
        int answer = 0;
        // 1. map 카운팅
        Map<Character, Integer> word = new HashMap<>();

        // 초기화
        init(word, before);

        // 값 체킹
        answer = aToB(word, after);

        return answer;
    }

    public static void init(Map<Character, Integer> word, String before) {
        char [] arr = before.toCharArray();
        for (int i=0 ; i<arr.length ; i++) {
            word.put(arr[i], word.getOrDefault(arr[i], 0) + 1);
        }
    }

    public static int aToB(Map<Character, Integer> word, String after) {
        char [] arr = after.toCharArray();
        for (int i=0 ; i<arr.length ; i++) {
            if (word.containsKey(arr[i])) {
                int cnt = word.get(arr[i]).intValue() - 1;
                if (cnt < 0) return 0;
                word.put(arr[i], cnt);
            } else {
                return 0;
            }
        }
        return 1;
    }
}
