package baekjoon.step16.q5086;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * step16 - 정수론 및 조합론
 * 배수와 약수
 * 
 * 메모리, 시간 제한  - 128 MB,   1초
 * 메모리, 시간      - 11372 KB, 76 MS
 *
 * @author tildev
 * @data 2021. 02. 08.
 */
public class Main {

	private static final String FACTOR = "factor";
	private static final String MULTIPLE = "multiple";
	private static final String NEITHER = "neither";
	
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int f, s;
    
    public static void main(String[] args) throws IOException {
        while(true) {
			st = new StringTokenizer(br.readLine());
			f = Integer.parseInt(st.nextToken());
		    s = Integer.parseInt(st.nextToken());
		    
		    if (f == 0 && s == 0) {
		    	break;
		    }
		    
		    if (f < s) {
		    	if (s % f == 0) {
		    		bw.write(FACTOR + "\n");
		    	} else {
		    		bw.write(NEITHER + "\n");
		    	}
		    } else if (f > s) {
		    	if (f % s == 0) {
		    		bw.write(MULTIPLE + "\n");
		    	} else {
		    		bw.write(NEITHER + "\n");
		    	}
		    } else {
		    	bw.write(NEITHER + "\n");
		    }
		    
        }
        
        bw.flush();
        bw.close();
    }
}