package dataStructure.basic.sort;

import java.util.Arrays;

public class Knumber {

    public static void main(String[] args) {
        int [] array = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands = {
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };
        System.out.println(solution(array, commands));
    }

    public static  int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int size = commands.length;

        for (int i=0 ;  i<size ; i++) {

            int fromIndex = commands[i][0];
            int toIndex = commands[i][1];

            int [] list = new int[toIndex - fromIndex + 1];
            int cnt = 0;
            for (int j = fromIndex-1 ; j<toIndex ; j++) {
                list[cnt++] = array[j];
            }
            Arrays.sort(list);
            answer[i]  = list[commands[i][2]-1];
        }

        return answer;
    }
}
