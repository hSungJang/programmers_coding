package dataStructure.basic.lvl2;

public class Carpet {

//    public static void main(String[] args) {
//
//        int brown = 12;
//        int yellow = 3;
//        int result [] = solution(brown, yellow);
//        System.out.println(result[0] + ", " + result[1]);
//
//    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int n = 1;
        while (true) {
            int carpetRow = n;
            int carpetColumn = yellow / n;
            if (yellow % n == 0) {
                int row = (carpetRow + 2) * 2;
                int col = carpetColumn * 2;
                int sum = row + col;
                if (sum == brown) {
                    answer[0] = carpetColumn + 2;
                    answer[1] = carpetRow + 2;
                    break;
                }
            }
            n++;
        }

        return answer;
    }
}
