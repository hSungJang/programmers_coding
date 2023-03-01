package dataStructure.basic.sort;

import java.util.Arrays;

public class String_sort_7_2 {

    public static void main(String[] args) {
        String strings [] = {"sun", "bed", "car"};
        // result : car , bed, sun
        String [] arg  = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println();;
        System.out.println(Arrays.toString(solution(arg, n)));;
    }


    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        // n 번째 요소를 맨 앞으로...
        answer = new String[strings.length];
        for (int i=0 ; i<strings.length ; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }

        // sorting
        Arrays.sort(answer);

        // 제외 처리
        for (int i=0 ;  i<answer.length ; i++) {
            answer[i] = answer[i].substring(1);
        }

        return answer;
    }
}
