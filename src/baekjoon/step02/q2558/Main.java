package baekjoon.step02.q2558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tildev
 * @data 2018. 7. 18.
 */
// A+B - 2
// 메모리 제한, 시간 제한/ 256MB, 1초
// 10028 KB, 76 MS
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.valueOf(br.readLine());
		int b = Integer.valueOf(br.readLine());

		System.out.println(a + b);
	}
}
