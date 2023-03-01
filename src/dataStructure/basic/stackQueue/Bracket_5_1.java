package dataStructure.basic.stackQueue;

public class Bracket_5_1 {


    public static void main(String[] args) {
        String case1 = "()()";
        String case2 = "(())()";
        String case3 = ")()(";
        String case4 = "(()(";


        System.out.println(solution(case4));
    }

    static boolean solution(String s) {
        boolean answer = true;
        // ( -> +1
        // ) -> -1

        char [] bracket = s.toCharArray();
        int size = bracket.length;
        int total = 0;
        for (int i=0 ; i<size ; i++) {
            if (bracket[i] == '(') total += 1;
            else total -= 1;
            if (total < 0) return false;
        }
        if (total != 0) return false;
        return answer;
    }
}
