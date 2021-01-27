package baekjoon.step12.q2108;

import java.io.*;
import java.util.*;

/**
 * 통계학
 * <p>
 * 메모리, 시간 제한  - 256  MB,   2초
 * 메모리, 시간      - 86520 KB, 1028 ms
 *
 * @author tildev
 * @data 2021. 01. 27.
 */
public class Main {
    private static int n, imp, modeMax = 0, sum = 0;
    private static String arithmeticMean, median, mode, range;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        //최빈값
        Map<Integer, Integer> modeMap = new HashMap<>();
        List<Integer> modeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            imp = Integer.parseInt(br.readLine());
            list.add(imp);
            sum += imp;
            modeMap.put(imp, modeMap.getOrDefault(imp, 0) + 1);
            if (modeMax < modeMap.get(imp)) {
                modeMax = modeMap.get(imp);
            }
        }
        arithmeticMean = String.format("%.0f", (float) sum / (float) n);
        list.sort(Comparator.naturalOrder());
        median = String.valueOf(list.get(n / 2));
        range = String.valueOf(list.get(n - 1) - list.get(0));
        for (Integer key : modeMap.keySet()) {
            if (modeMap.get(key) == modeMax) {
                modeList.add(key);
            }
        }

        if (modeList.size() == 1) {
            mode = String.valueOf(modeList.get(0));
        } else {
            modeList.sort(Comparator.naturalOrder());
            mode = String.valueOf(modeList.get(1));
        }

        // 산술평균 출력
        bw.write(arithmeticMean + "\n");
        // 중앙값 출력
        bw.write(median + "\n");
        // 최빈값 출력, 여러개 있을 경우 두 번쨰 작은 수
        bw.write(mode + "\n");
        // 범위 출력
        bw.write(range + "\n");

        bw.flush();
        bw.close();
    }
}
