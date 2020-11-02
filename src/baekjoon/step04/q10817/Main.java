package baekjoon.step04.q10817;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2018. 7. 30.
 */
// 세 수
// 메모리 제한, 시간 제한/ 256MB, 1초
// 10192 KB, 76 ms
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        List<Integer> list = new ArrayList<>();

        list.add(Integer.valueOf(st.nextToken()));
        list.add(Integer.valueOf(st.nextToken()));
        list.add(Integer.valueOf(st.nextToken()));

        list.sort(Comparator.naturalOrder());

        bw.write(String.valueOf(list.get(1)));
        bw.close();
    }
}
