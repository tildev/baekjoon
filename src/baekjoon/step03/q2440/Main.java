package baekjoon.step03.q2440;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author tildev
 * @data 2018. 7. 18.
 */
// 별찍기 - 3
// 메모리 제한, 시간 제한/ 128MB, 1초
// 10176 KB, 80 MS 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		bw.close();
	}
}
