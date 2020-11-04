package baekjoon.step17.q4949;

import java.io.*;
import java.util.Stack;

/**
 * 균형잡힌 세상
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 19652 KB, 284 MS
 *
 * @author tildev
 * @data 2020. 11. 05.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            Stack<Character> stack = new Stack<>();
            String ps = br.readLine();
            boolean isBalance = true;

            if (ps.length() == 1 && ps.equals(".")) {
                break;
            }

            for (int j = 0; j < ps.length(); j++) {
                if (ps.charAt(j) == '(') {
                    stack.push('(');
                } else if (ps.charAt(j) == '[') {
                    stack.push('[');
                } else if (ps.charAt(j) == ')') {
                    if (stack.size() == 0 || stack.pop() != '(') {
                        isBalance = false;
                        break;
                    }
                } else if (ps.charAt(j) == ']') {
                    if (stack.size() == 0 || stack.pop() != '[') {
                        isBalance = false;
                        break;
                    }
                } else if (ps.charAt(j) == '.') {
                    break;
                }
            }
            if (isBalance && stack.size() == 0) {
                bw.write("yes");
            } else {
                bw.write("no");
            }
            bw.newLine();

        }
        bw.flush();
        bw.close();
    }
}
