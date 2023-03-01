package dataStructure.basic.stackQueue;

import java.util.Deque;
import java.util.LinkedList;

public class Printer_5_4 {

    public static void main(String[] args) {
        int [] priorities1 = {2, 1, 3, 2};
        int location1 = 2;

        int [] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;
        System.out.println(solution(priorities1, location1));
    }
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        char target = (char) ((char) 65 + location + 1);
        // 큐에 값 셋팅
        Deque<Character> printList = new LinkedList<>();
        Deque<Integer> priority = new LinkedList<>();

        for (int i=0 ; i<priorities.length ; i++) {
            printList.offerLast((char) ((char) 65+i));
            priority.offerLast(priorities[i]);
        }

        //1. 우선순위 별 정렬
        while (!priority.isEmpty()) {
            // trigger
            int count = 0;
            if (priority.size() == 0) break;

            // 1. 가장 앞에 있는 대기 목록
            int cur = priority.pollFirst();
            char curChar = printList.pollFirst();

            // 2. 중요도 체크
            for (int i=0 ; i<priority.size() ; i++) {
                int next = priority.pollFirst();
                char nextChar = printList.pollFirst();
                priority.offerFirst(next);
                printList.offerFirst(nextChar);
                // 값 변경
                if (cur < next) {
                    count++;
                    priority.offerLast(cur);
                    printList.offerLast(curChar);
                    break;
                }

                // 마지막
                if ((i == priority.size()-1) && cur >= next) {
                    priority.offerFirst(cur);
                    printList.offerFirst(curChar);
                    break;
                }
            }

            answer++;
            if ( count == 0 && printList.pollFirst() == target)  break;
            else priority.pollFirst();
        }

        //2. 전체 탐색 후 location 과 같은 값 리턴


        return answer;
    }
}
