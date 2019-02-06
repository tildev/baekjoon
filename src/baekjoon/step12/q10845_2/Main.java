package baekjoon.step12.q10845_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        Que que = new Que();
        
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            int num = 0;
            if (command.contains("push")) {
                StringTokenizer st = new StringTokenizer(command, " ");
                command = st.nextToken();
                num = Integer.valueOf(st.nextToken());
                que.push(num);
            } else if (command.contains("pop")) {
                bw.write(que.pop() + "\n");
            } else if (command.contains("size")) {
                bw.write(que.size() + "\n");
            } else if (command.contains("empty")) {
                bw.write(que.empty() + "\n");
            } else if (command.contains("front")) {
                bw.write(que.front() + "\n");
            } else if (command.contains("back")) {
                bw.write(que.back() + "\n");
            }
        }
        bw.close();
    }
}

class Que {
    private int size = 0;
    private List<Integer> que;

    public Que() {
        que = new ArrayList<>();
    }

    public void push(int a) {
        que.add(a);
        size++;
    }

    public int pop() {
        if (que.size() == 0) {
            return -1;
        } else {
            int rVal = que.get(0);
            que.remove(0);
            size--;
            return rVal;
        }
    }

    public int size() {
        return que.size();
    }

    public int empty() {
        return size == 0 ? 1 : 0;
    }

    public int front() {
        return size == 0 ? -1 : que.get(0);
    }

    public int back() {
        return size == 0 ? -1 : que.get(size - 1);
    }
}
