package dataStructure.basic.lvl2;

import java.util.LinkedList;
import java.util.List;

public class Speed {

//    public static void main(String[] args) {
//        int [] progresses = {95, 90, 99, 99, 80, 99};
//        int [] speeds = {1, 1, 1, 1, 1, 1};
//        System.out.println(solution(progresses, speeds));
//    }
    static class Work {
        int progress;
        int speed;
        Work(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        void setProgressBySpeed(int progress) {
            this.progress = progress + this.speed;
            if (progress >= 100) this.progress = 100;
        }
    }

    public static List<Integer>  solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        List<Work> list = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        // Work에 셋
        for (int i=0 ; i<progresses.length ; i++) {
            list.add(new Work(progresses[i], speeds[i]));
        }

        // while: 작업 진도 올리기
        while (list.size() > 0) {
            // 작업 진도
            for (int i=0 ; i<list.size() ; i++) {
                Work work = list.get(i);
                work.setProgressBySpeed(work.progress);
            }

            int deployment = 0;
            // 배포
            int size = list.size();
            for (int i=0 ; i<size ; i++) {
                if (list.get(0).progress < 100) {
                    break;
                }
                deployment++;
                list.remove(0);
            }

            if (deployment > 0) result.add(deployment);
        }

        return result;
    }

}
