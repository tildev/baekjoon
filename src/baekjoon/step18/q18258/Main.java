package baekjoon.step18.q18258;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 큐2
 * 메모리, 시간 제한  - 512 MB,   1초
 * 메모리, 시간      - 339904 KB, 1612 MS
 *
 * @author tildev
 * @data 2020. 11. 15.
 */
public class Main {
    static Queue<Integer> queue = new LinkedList<>();

    private static int size = 0;
    private static int lastValue = -1;
    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";
    private static final String BACK = "back";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            if (PUSH.equals(command)) {
                lastValue = Integer.parseInt(st.nextToken());
                push(lastValue);
            } else if (POP.equals(command)) {
                bw.write(pop() + "\n");
            } else if (SIZE.equals(command)) {
                bw.write(size() + "\n");
            } else if (EMPTY.equals(command)) {
                if (empty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (FRONT.equals(command)) {
                bw.write(front() + "\n");
            } else if (BACK.equals(command)) {
                bw.write(back() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    public static void push(int x) {
        queue.add(x);
        size += 1;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }
        size -= 1;
        return queue.poll();
    }

    public static int size() {
        return size;
    }

    public static boolean empty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public static int front() {
        if (size == 0) {
            return -1;
        }
        return queue.peek();
    }

    public static int back() {
        if (size == 0) {
            return -1;
        }
        return lastValue;
    }
}
