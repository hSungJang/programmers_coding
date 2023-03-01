package dataStructure.practice.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : DotProduct
 * author         : janghyoseong
 * date           : 2023/02/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/05        janghyoseong       최초 생성
 */
public class DotProduct {

    public static void main(String[] args) {
        DotProduct dp = new DotProduct();
        System.out.println(dp.solution(new int []{1,2,3,4}, new int []{-3,-1,0,2}));
    }
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for ( int i =0 ; i<a.length ; i++) {
            answer += (a[i] * b[i]);
        }
        return answer;
    }
}
