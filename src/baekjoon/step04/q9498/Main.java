package baekjoon.step04.q9498;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author tildev
 * @data 2018. 7. 30.
 */
// 시험 성적
// 메모리 제한, 시간 제한/ 128MB, 1초
// 10120 KB, 76 ms
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int score = Integer.valueOf(br.readLine());

		if (score >= 90) {
			bw.write("A");
		} else if (score >= 80) {
			bw.write("B");
		} else if (score >= 70) {
			bw.write("C");
		} else if (score >= 60) {
			bw.write("D");
		} else {
			bw.write("F");
		}

		bw.close();
	}
}
