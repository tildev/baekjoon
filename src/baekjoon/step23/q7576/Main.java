package baekjoon.step23.q7576;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 토마토
 * 메모리, 시간 제한  - 256 MB,   1 초
 * 메모리, 시간      -  KB,  ms
 *
 * @author tildev
 * @data 2020. 12. 28.
 */
public class Main {

    private static int m, n;
    private static int[][] visited = new int[1000][1000];

    private static StringTokenizer st;

    private static LinkedList<Integer> queue = new LinkedList<>();

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[m][n];

        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.flush();
        bw.close();
    }

}
