package dataStructure.practice.stackQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDev_5_2 {


    public static void main(String[] args) {
        // 순서대로 개발이 완료가 되어야지 후 기능이 완료가 되어도 배포가 가능하다.
        int [] pro1 = {93, 30, 55};
        int [] spe1 = {1, 30, 5};
        System.out.println(solution(pro1, spe1));
    }

    public static List<Integer> solution(int[] progresses, int[] speeds) {
        // 1. 하루마다 speed 만큼 더하기
        // 2. 맨 처음 기능이 마무리가 되면 뒤 기능 100 인지 확인
        Queue<Integer> progress = new LinkedList<>();
        Queue<Integer> speed = new LinkedList<>();
        int size = progresses.length;

        for (int i= 0 ; i<size ; i++) {
            progress.add(progresses[i]);
            speed.add(speeds[i]);
        }

        List<Integer> result = new LinkedList<>();

        while (true) {
            int queueSize = progress.size();
            int count = 0;
            // 1.하루마다 speed 만큼 더하기
            for (int i=0 ; i<queueSize ; i++) {
                int pro = progress.poll();
                int spd = speed.poll();
                progress.add(pro + spd);
                speed.add(spd);
            }

            for (int i=0 ; i<queueSize ; i++) {
                if (progress.peek() >= 100) {
                    progress.poll();
                    speed.poll();
                    count++;
                } else {
                    break;
                }
            }

            if (count > 0) result.add(count);
            if (queueSize == 0) break;
        }
        return result;
    }
}
