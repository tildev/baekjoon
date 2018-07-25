package baekjoon.step03.q11720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author tildev
 * @data 2018. 7. 25.
 */
// 숫자의 합
// 메모리 제한, 시간 제한/ 256MB, 1초
// 10080 KB, 84 ms
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(br.readLine());
		String num = br.readLine();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += num.charAt(i) - '0';
		}

		bw.write(String.valueOf(sum));
		bw.close();
	}
}
