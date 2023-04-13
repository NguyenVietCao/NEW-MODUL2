package luyen_tap_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời nhập số");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("----Danh số nguyên tố lưu ở  stack-----");

        for (Integer s : getPrimeUseStack(n)) {
            System.out.println(s);
        }

        System.out.println("----Danh sách số nguyên tố lưu ở Queue----");
        for (Integer q : getPrimeUseQueue(n)) {
            System.out.println(q);
        }
    }

    // Kiểm tra số nguyên tố :

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Phương thức trả về stack
    public static Stack<Integer> getPrimeUseStack(int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        return stack;
    }

    // Phương thức trả về Queue
    public static Queue<Integer> getPrimeUseQueue(int n) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {

                queue.add(i);
            }
        }
        return queue;
    }
}
