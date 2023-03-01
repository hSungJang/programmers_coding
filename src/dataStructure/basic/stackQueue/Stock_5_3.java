package dataStructure.basic.stackQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Stock_5_3 {
    public static void main(String[] args) {
        int [] case1 = {1, 2, 3, 2, 3};
        System.out.println(solution(case1));
    }

    public static List<Integer> solution(int[] prices) {
        List<Integer> result = new LinkedList<>();
        // 하나씩 비교할 값을 순차적으로 꺼내기 위한 queue
        Queue<Integer> stock = new LinkedList<>();
        for (int i=0 ; i<prices.length ; i++) {
            stock.add(prices[i]);
        }

        while (true) {

            // 1. 현재 초에 대한 값 셋팅
            int cur = stock.poll();
            int size = stock.size();
            // 2. count는 매번 초기화
            int count = 0;
            // 3. 배열 돌면서 값 비교
            // 3-1. prices.length - size -> 시작점을 바꾸기 위한 장치
            for (int i=prices.length - size ; i<prices.length ; i++) {
                // 매초 count ++
                count++;
                // 하락하는 순간 탈출
                if (cur > prices[i]) break;
            }
            // 탈출 후 하락까지 값 설정
            result.add(count);
            // 탈출 장치
            if (size == 0) break;
        }

        return result;
    }
}
