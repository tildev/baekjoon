package baekjoon.step17.q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2020. 11. 04.
 */
// 스택
// 메모리 제한, 시간 제한/ 256MB, 0.5초
// 19248 KB, 372 MS
public class Main {

    static List<Integer> stack = new ArrayList<>();

    private static int size = 0;
    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String TOP = "top";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < commandCnt; i++) {
            String commandLine = br.readLine();
            StringTokenizer st = new StringTokenizer(commandLine, " ");
            String command = st.nextToken();
            if (command.equals(PUSH)) {
                int value = Integer.parseInt(st.nextToken());
                push(value);
            } else if (command.equals(POP)) {
                pop();
            } else if (command.equals(SIZE)) {
                size();
            } else if (command.equals(EMPTY)) {
                empty();
            } else if (command.equals(TOP)) {
                top();
            }
        }
    }

    public static void push(int x) {
        stack.add(x);
        size += 1;
    }

    public static void pop() {
        if (size == 0) {
            System.out.println(-1);
        } else {
            int x = stack.get(size - 1);
            stack.remove(size - 1);
            size -= 1;
            System.out.println(x);
        }
    }

    public static void size() {
        System.out.println(size);
    }

    public static void empty() {
        if (size == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void top() {
        if (size == 0) {
            System.out.println(-1);
        } else {
            System.out.println(stack.get(size - 1));
        }
    }
}
