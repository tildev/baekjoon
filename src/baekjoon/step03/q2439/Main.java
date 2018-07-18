package baekjoon.step03.q2439;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author tildev
 * @data 2018. 7. 18.
 */
// 별찍기 - 2
// 메모리 제한, 시간 제한/ 128MB, 1초
// 10356 KB, 84 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				bw.write(" ");
			}
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		bw.close();
	}
}
