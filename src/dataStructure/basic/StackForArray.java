package dataStructure.basic;

/**
 * packageName    : dataStructure.basic
 * fileName       : Stack
 * author         : janghyoseong
 * date           : 2023/03/01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/01        janghyoseong       최초 생성
 */

class CustomStatck<T> {
    // top: index
    // size: 크기
    // 데이터 담을 공간
    private int top;
    private int size;
    private T [] stack;
    CustomStatck(int size) {
        this.size = size;
        this.top = -1;
        this.stack = (T[]) new Object[size];
    }

    private boolean validStack() {
        if (this.top == -1) {
            System.out.println("현재 스택은 비어있습니다.");
            return false;
        }
        return true;
    }

    /**
     * 스택의 전체 사이즈
     * @return
     */
    public int size() {
        System.out.println(this.size);
        return this.size;
    }

    public void top() {
        System.out.println("TOP:: 현재 크기: " + (this.top + 1));
    }

    public void peek() {
        if (!this.validStack()) return ;
        System.out.println("peek: " + stack[this.top]);
    }

    public boolean empty() {
        if (this.top == -1) {
            System.out.println("empty:: 비어있습니다.");
            return true;
        }
        System.out.println("empty:: 비어있지 않습니다.");
        return false;
    }


    public void pop() {
        if (!this.validStack()) return ;
        T temp = stack[this.top];
        stack[this.top] = null;
        this.top--;
        System.out.println("Pop: " + temp);
    }

    public void push(T data) {
        if (this.size == this.top +1) {
            System.out.println("Push:: 더 이상 넣을 수 없습니다.");
            return;
        };
        this.stack[++this.top] = data;
    }

    public void clear() {
        int t = this.top;
        for (int i=0 ; i<=t ; i++) {
            stack[i] = null;
            top--;
        }
    }

    /**
     * start: 0 , end: size - 1
     * @param index
     * @return
     */
    public T search(int index) {
        if (index < 0 || index == this.size) {
            System.out.println("Search:: 인덱스 범위를 벗어났습니다.");
            return null;
        }
        if (index > this.top) {
            System.out.println("Search:: 값이 없습니다.");
            return null;
        }
        System.out.println("Search:: "+ this.stack[index]);
        return this.stack[index];
    }
}

public class StackForArray {

    /**
     *
     * https://go-coding.tistory.com/5
     * stack을 구현해 봅시다~
     * 후입선출
     * 1. push
     * 2. pop: 데이터 팝
     * 3. peek: 데이터 유지
     * 4. clear
     * 5. size
     * 6. empty
     * 7. search
     * @param args
     */
    public static void main(String[] args) {
        CustomStatck<Integer> statck = new CustomStatck<>(5);
        // 1. error 케이스
        statck.push(1);
        statck.push(2);
        statck.push(3);
        statck.push(4);
        statck.search(0);
        statck.push(5);
        statck.search(5);
        statck.push(10); // -> push 불가
        statck.pop(); // 기댓값 5
        // 스택 클리어
        statck.clear();
        statck.empty();

        statck.top();
        statck.push(1);
        statck.top();
        statck.empty();

    }

}
