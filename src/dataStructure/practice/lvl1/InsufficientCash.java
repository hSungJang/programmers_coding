package dataStructure.practice.lvl1;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : InsufficientCash
 * author         : janghyoseong
 * date           : 2023/02/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/06        janghyoseong       최초 생성
 */
public class InsufficientCash {
    public static void main(String[] args) {
        InsufficientCash is = new InsufficientCash();
        System.out.println(is.solution(3, 20, 4));
    }

    public long solution(int price, int money, int count) {
        long answer = -1;

        int total = 0;
        for (int i=1 ; i<=count ; i++) {
            total += (price * i);
        }

        return (long) money < total ? total - money : 0;
    }
}
