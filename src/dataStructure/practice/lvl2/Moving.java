package dataStructure.practice.lvl2;

public class Moving {

//    public static void main(String[] args) {
//        String dirs = "ULURRDLLU";
//        System.out.println(solution(dirs));
//    }



    public static int solution(String dirs) {
        int answer = 0;
        // 4,4
        int x = 5;
        int y = 5;

        boolean visited[][] = new boolean[11][11];
        char [] dir = dirs.toCharArray();

        for (char i : dir) {

            // 방향키
            switch (i) {
                case 'U': // up
                    x -= 1;
                    if (x < 0) x = 0;
                    break;
                case 'L':
                    y -= 1;
                    if (y < 0) y = 0;
                    break;
                case 'R':
                    y += 1;
                    if (y > 10) y = 10;
                    break;
                case 'D':
                    x += 1;
                    if (x > 10) x = 10;
                    break;
                default:
                    break;
            }
            // 방향은 이미 이동 됐음
            if (!visited[x][y]) {
                visited[x][y] = true;
                answer++;
            }
        }
        return answer;
    }



}
