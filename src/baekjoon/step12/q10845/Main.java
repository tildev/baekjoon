package baekjoon.step12.q10845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static List<Integer> que = new ArrayList<>();

    private static void push(int a) {
        que.add(a);
    }

    private static int pop() {
        if (que.size() == 0) {
            return -1;
        } else {
            int rVal = que.get(0);
            que.remove(0);
            return rVal;
        }
    }

    private static int size() {
        return que.size();
    }

    private static int empty() {
        if (que.size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int front() {
        if (que.size() == 0) {
            return -1;
        } else {
            return que.get(0);
        }
    }

    private static int back() {
        if (que.size() == 0) {
            return -1;
        } else {
            return que.get(que.size() - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            int num = 0;
            if (command.contains("push")) {
                StringTokenizer st = new StringTokenizer(command, " ");
                command = st.nextToken();
                num = Integer.valueOf(st.nextToken());
                push(num);
            } else if (command.contains("pop")) {
                bw.write(pop() + "\n");
            } else if (command.contains("size")) {
                bw.write(size() + "\n");
            } else if (command.contains("empty")) {
                bw.write(empty() + "\n");
            } else if (command.contains("front")) {
                bw.write(front() + "\n");
            } else if (command.contains("back")) {
                bw.write(back() + "\n");
            }
        }
        bw.close();
    }
}
