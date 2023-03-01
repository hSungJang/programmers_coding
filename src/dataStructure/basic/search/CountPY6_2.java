package dataStructure.basic.search;

public class CountPY6_2 {
//    public static void main(String[] args) {
//
//        String case1 = "pPoooyY";
//        String case2 = "Pyy";
//        System.out.println(solution(case2));
//    }

    static boolean solution(String s) {
        boolean answer = true;
        char [] list = s.toLowerCase().toCharArray();
        int pCnt = 0;
        int yCnt = 0;
        for (char c : list) {
            if (c == 'p') pCnt++;
            if (c == 'y') yCnt++;
        }

        return pCnt == yCnt;
    }
}
