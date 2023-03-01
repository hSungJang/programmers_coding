package dataStructure.basic.arrayList;

import java.util.LinkedList;
import java.util.List;

public class MaxValueIndex {

//    public static void main(String[] args) {
//        int [] arr = {1, 3, 5, 4, 5, 2, 1};
//        System.out.println(Arrays.toString(solution(arr)));
//    }

    // list 방식으로 처리
    public static Object[] solution(int[] arr) {
        List answer = new LinkedList();
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++) {
            if (max < arr[i]) {
                answer.clear();
                max = arr[i];
                answer.add(i);
            } else if (max == arr[i]) {
                answer.add(i);
            }
        }
        return answer.toArray();
    }
}
