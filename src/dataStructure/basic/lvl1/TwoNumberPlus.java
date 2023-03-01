package dataStructure.basic.lvl1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TwoNumberPlus {

    public static void main(String[] args) {
        int [] numbers = {2,1,3,4,1};

        int [] numbers2 = {5,0,2,7};
        System.out.println(solution(numbers2).toString());
    }

    // 완전 탐색 -> greedy?
    public static int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();
        // 알고리즘: 탐색
        for (int i=0  ; i<numbers.length ; i++) {
            for (int j=i+1 ; j<numbers.length ; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[set.size()];
        Iterator it = set.iterator();
        int idx = 0;
        while (it.hasNext()) {
            answer[idx++] = (int) it.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}
