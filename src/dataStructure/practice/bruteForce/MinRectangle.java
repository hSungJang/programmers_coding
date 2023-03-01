package dataStructure.practice.bruteForce;

public class MinRectangle {

    public static void main(String[] args) {
        int [][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int [][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7},{5, 15}};
        int [][] sizes3 = { {3,5}, {6,2}}; // 3, 6
        System.out.println(solution(sizes3));
    }

    public static int solution(int[][] sizes) {
        int answer = Integer.MAX_VALUE;

        for (int i=0 ; i < sizes.length ; i++) {
            for( int j=0 ; j < sizes.length ; j++) {
                boolean fail = false;
                int w = sizes[i][0];
                int h = sizes[j][1];

                for (int a=0 ; a < sizes.length ; a++) {
                    if (!((w >= sizes[a][0] && h >= sizes[a][1]) || (w  >= sizes[a][1] && h  >= sizes[a][0]))) {
                        fail = true;
                        break;
                    }
                }
                if (fail) continue;
                else answer = Math.min(answer, w * h);
            }
        }
        return answer;
    }

}
