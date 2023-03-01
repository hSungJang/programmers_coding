package dataStructure.basic.lvl1;

import java.util.Scanner;

/**
 * packageName    : dataStructure.basic.lvl1
 * fileName       : Rectangle
 * author         : janghyoseong
 * date           : 2023/02/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/06        janghyoseong       최초 생성
 */
public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
        for (int j=0 ; j<b ; j++) {
            for (int i=0 ; i<a ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
