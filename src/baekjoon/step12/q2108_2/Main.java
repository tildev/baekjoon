package baekjoon.step12.q2108_2;

import java.io.*;

/**
 * 통계학
 * <p>
 * 메모리, 시간 제한  - 256  MB,  2초
 * 메모리, 시간      - 40016 KB, 264 ms
 *
 * @author tildev
 * @data 2021. 01. 28.
 */
public class Main {

    private static final int ARRAY_SIZE = 8001;
    // 해당 arr 값은 -4000 , index 8000 일때의 값은 -1
    private static final int MINUS_MIN_INDEX = 4001;

    private static int n, tmp, cnt = 0, modeMaxCnt = 0, rangeMin = -4001, rangeMax = 0;
    private static double sum = 0;

    private static int[] arr = new int[ARRAY_SIZE];
    private static String arithmeticMean, median, mode, range;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(br.readLine());
            if (tmp < 0) {
                arr[tmp + ARRAY_SIZE]++;
            } else {
                arr[tmp]++;
            }
        }

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (arr[i] == 0) {
                continue;
            }
            if (i >= MINUS_MIN_INDEX) {
                sum += ((i - ARRAY_SIZE) * arr[i]);
            } else {
                sum += (i * arr[i]);
            }
        }
        // 산술평균(arithmetic mean) 출력
        bw.write(Math.round(sum / n) + "\n");

        for (int i = MINUS_MIN_INDEX; i < MINUS_MIN_INDEX + ARRAY_SIZE; i++) {
            if (i > ARRAY_SIZE - 1) {
                cnt += arr[i - ARRAY_SIZE];
            } else {
                cnt += arr[i];
            }
            if (cnt > n / 2) {
                // 중앙값(median) 출력
                bw.write(i - ARRAY_SIZE + "\n");
                break;
            }
        }

        tmp = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (tmp < arr[i]) {
                tmp = arr[i];
                modeMaxCnt = 1;
            } else if (tmp == arr[i]) {
                modeMaxCnt++;
            }
        }
        if (modeMaxCnt > 1) {
            modeMaxCnt = 2;
        }
        for (int i = MINUS_MIN_INDEX; i < MINUS_MIN_INDEX + ARRAY_SIZE; i++) {
            if (i > ARRAY_SIZE - 1) {
                if (arr[i - ARRAY_SIZE] == tmp) {
                    modeMaxCnt--;
                }
            } else {
                if (arr[i] == tmp) {
                    modeMaxCnt--;
                }
            }
            if (modeMaxCnt == 0) {
                // 최빈값(mode) 출력, 여러개 있을 경우 두 번쨰 작은 수
                bw.write(i - ARRAY_SIZE + "\n");
                break;
            }

        }

        for (int i = MINUS_MIN_INDEX; i < MINUS_MIN_INDEX + ARRAY_SIZE; i++) {
            if (i > ARRAY_SIZE - 1) {
                if (arr[i - ARRAY_SIZE] != 0) {
                    if (rangeMin == -4001) {
                        rangeMin = i - ARRAY_SIZE;
                    }
                    rangeMax = i - ARRAY_SIZE;
                }
            } else {
                if (arr[i] != 0) {
                    if (rangeMin == -4001) {
                        rangeMin = i - ARRAY_SIZE;
                    }
                    rangeMax =  i - ARRAY_SIZE;
                }
            }
        }
        // 범위 출력
        bw.write(rangeMax - rangeMin + "\n");

        bw.flush();
        bw.close();
    }
}
