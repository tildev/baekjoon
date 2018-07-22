package baekjoon.step03.q1924;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2018. 7. 18.
 */
// 2007년
// 메모리 제한, 시간 제한/ 128MB, 2초
// 10116 KB, 76 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] dayOfTheWeek = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int month = Integer.valueOf(st.nextToken());
		int day = Integer.valueOf(st.nextToken());

		int dayCount = 0;

		for (int i = 1; i < month; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				dayCount += 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				dayCount += 30;
			} else if (i == 2) {
				dayCount += 28;
			}
		}
		dayCount += day;
		bw.write(dayOfTheWeek[dayCount % 7]);
		bw.close();
	}
}
