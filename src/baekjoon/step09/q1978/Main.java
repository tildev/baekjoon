package baekjoon.step09.q1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 소수 찾기 
 * 
 * 메모리, 시간 제한 - 128 MB,	 2초 
 * 메모리, 시간	 - 11636 KB, 88 ms
 *
 * @author tildev
 * @data 2020. 12. 07.
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int cnt = 0;
		int result = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());

			cnt = 0;
			for (int j = 1; j < num; j++) {
				if (num % j == 0)
					cnt += 1;
			}
			if (cnt == 1) {
				result += 1;
			}

		}

		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}
