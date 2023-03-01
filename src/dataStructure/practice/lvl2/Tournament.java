package dataStructure.practice.lvl2;

public class Tournament {

//    public static void main(String[] args) {
//
//        int n = 8;
//        int a = 4;
//        int b = 7;
//        System.out.println(solution(n, a , b));
//    }


    public static int solution(int n, int a, int b)
    {
        int answer = 0;
        // a, b 같은 그룹
        // 그룹 처리필요
        while ( a != b ) {
            a = a%2 == 0 ? a/2 : (a+1)/2;
            b = b%2 == 0 ? b/2 : (b+1)/2;
            answer++;
        }
        return answer;
    }
}
