package baekjoon.step17.q1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택 수열
 * 메모리, 시간 제한  - 128 MB,   2초
 * 메모리, 시간      - 28088 KB, 372 MS
 *
 * @author tildev
 * @data 2020. 11. 08.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int[] numArr = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < n + 1; i++) {
            stack.add(i);
            sb.append("+\n");

            while (stack.peek() == numArr[index]) {
                stack.pop();
                sb.append("-\n");
                index++;
                if (stack.isEmpty())
                    break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb.toString());
        }
    }
}
