package dataStructure.practice.lvl1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : minNumber
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class minNumber {
    public static void main(String[] args) {
        System.out.println(new minNumber().solution(new int[]{10}));
    }

    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length == 1 ? arr.length : arr.length-1 ];
        // -1 처리
        if (arr.length == 1) {
            answer[0] = -1;
            return answer;
        }

        int temp [] = Arrays.copyOf(arr, arr.length);
        List<Integer> list = new LinkedList<>();
        Arrays.sort(arr);
        for (int i=0 ; i< temp.length ; i++ ) {
            if (temp[i] == arr[0]) continue;
            list.add(temp[i]);
        }

        answer = list.stream().mapToInt(value -> value).toArray();

        return answer;
    }
}
