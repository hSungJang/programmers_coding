package dataStructure.basic.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SameNumber_4_3 {

    public static void main(String[] args) {
        // 나열 된 중복 된 숫자 제거 하면서 순서를 지키면 된다.
        int [] case1 = {1,1,3,3,0,1,1};
        int [] case2 = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(case2)));
    }

    public static int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new LinkedList<>();
        // data 설정, 입력 값 자연수이므로 -1로 설정
        int pre = -1;
        for ( int i : arr ) {
            // 이전 수와 같지 않다면 저장
            if (pre != i) list.add(i);
            // pre 값 계속 유지
            pre = i;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
