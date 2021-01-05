package baekjoon.step12.q10814;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 나이순 정렬
 * <p>
 * *** 런타임 에러가 처음에 났는데, compare 를 잘 못 처리 했다.
 * e1 == e2 일때는 반드시 return 0 이 보장 되어야 함 ***
 * <p>
 * 메모리, 시간 제한  - 256 MB,   3 초
 * 메모리, 시간      - 59880 KB, 896 ms
 *
 * @author tildev
 * @data 2020. 01. 06.
 */
public class Main {
    private static int n;
    private static String[][] member;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        n = Integer.parseInt(br.readLine());

        member = new String[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            member[i][0] = st.nextToken();
            member[i][1] = st.nextToken();
        }

        Arrays.sort(member, (e1, e2) -> {
            int e10 = Integer.parseInt(e1[0]);
            int e20 = Integer.parseInt(e2[0]);
            if (e10 == e20) {
                return 0;
            } else {
                return e10 - e20;
            }
        });

        for (Object[] o : member) {
            bw.write(o[0] + " " + o[1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
