package dataStructure.practice.lvl2;

public class Square {

//    public static void main(String[] args) {
//
////        int [][]board = {
////                {0,1,1,1},
////                {1,1,1,1},
////                {1,1,1,1},
////                {0,0,1,0}
////        };
////
//        int [][]board = {
//                {0,0,1,1},
//                {1,1,1,1},
//        };
//        System.out.println(solution(board));
//    }



    public static int solution(int [][]board) {
        int answer = 0;
        boolean squareCheck = false;
        for (int i=0 ; i<board.length ; i++) {
            for (int j=0 ; j<board[0].length ; j++) {
                if (board[i][j] == 1) {
                    int index = 1;
                    squareCheck = false;
                    while (!squareCheck) {
                        if (i+(index) >= board.length || j+(index) >= board.length) {
                            if (answer <= index * index) {
                                answer = index * index;
                            }
                            break;
                        }

                        for (int x = index ; x < index + 1; x++ ) {
                            for (int y = index ; y < index + 1; y++ ) {
                                if (board[i+x][j+y] != 1) {
                                    squareCheck = !squareCheck;
                                    if (answer <= ((index + 1) * (index + 1))) {
                                        answer = (index + 1) * (index + 1);
                                    }
                                    break;
                                }
                            }
                        }
                        index ++;
                    }
                }
            }
        }
        return answer == 1 ? 4 : answer;
    }

}
