package baekjoon.step05.q4673;

/**
 * @author tildev
 * @data 2018. 9. 26.
 */
// 셀프 넘버
// 메모리 제한, 시간 제한/ 128MB, 1초
// 10824 KB, 104 ms
public class Main {
    public static void main(String[] args) {
        int i = 0;
        boolean arr[] = new boolean[10001];
        while (true) {
            i++;
            int n = i;
            int sum = n;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum <= 10000) {
                arr[sum] = true;
            }

            if (i > 10000) {
                break;
            }
        }
        for (int j = 1; j < arr.length; j++) {
            if (!arr[j]) {
                System.out.println(j);
            }
        }

    }

}
