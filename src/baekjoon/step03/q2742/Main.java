package baekjoon.step03.q2742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @data 2018. 7. 18.
 */
// 기찍 N
// 메모리 제한, 시간 제한/ 128MB, 1초
// 30844 KB, 652 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		int n = Integer.valueOf(s);

		for (int i = n; i >0; i--) {
			System.out.println(i);
		}
	}
}
