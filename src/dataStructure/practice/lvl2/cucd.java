package dataStructure.practice.lvl2;

public class cucd {

//    public static void main(String[] args) {
//        int[] arrayA = {14, 35, 119};
//        int[] arrayB= {18, 30, 102};
//        System.out.println(solution(arrayA, arrayB));
//
//    }

    public static int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        return answer;
    }

    static int eucd(int bn, int sn) {
        int r = bn % sn;
        if (r == 0) {
            return sn;
        } else {
            return eucd(sn, r);
        }
    }

}
