package baekjoon.step12.q1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 단어 정렬
 * <p>
 * 메모리, 시간 제한  - 256 MB,   2 초
 * 메모리, 시간      - 36328 KB, 444 ms
 *
 * @author tildev
 * @data 2020. 01. 05.
 */
public class Main {
    private static int n;
    private static String[] sArr;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        n = Integer.parseInt(br.readLine());

        sArr = new String[n];
        for (int i = 0; i < n; i++) {
            sArr[i] = br.readLine();
        }

        Arrays.sort(sArr, (e1, e2) -> {
            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            } else {
                return e1.length() - e2.length();
            }
        });

        Set<String> sSet = new LinkedHashSet<>();
        for (String s : sArr) {
            sSet.add(s);
        }
        
        for (String s : sSet) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
