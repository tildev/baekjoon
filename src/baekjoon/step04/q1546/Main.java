package baekjoon.step04.q1546;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author tildev
 * @data 2018. 7. 30.
 */
// 평균
// 메모리 제한, 시간 제한/ 128MB, 2초
// 10856 KB, 80 ms
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.valueOf(br.readLine());

		double sum = 0;
		double max = 0;
		double impD = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < count; i++) {
			impD = Double.valueOf(st.nextToken());
			if (max < impD) {
				max = impD;
			}
			sum += impD;
		}

		bw.write(String.valueOf((Math.round((sum / max * 100) / count * 100)) / 100.0));
		bw.close();
	}
}
