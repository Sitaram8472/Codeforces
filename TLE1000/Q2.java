import java.util.*;

public class Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int even = 0;
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        if (num[i] % 2 == 0) {
          even++;
        }
      }

      int min = Integer.MAX_VALUE;

      for (int i = 0; i < n; i++) {
        int product = (k - (num[i] % k)) % k;
        min = Math.min(min, product);

      }

      if (k != 4) {
        System.out.println(min);
      } else if (k == 4 && n == 1) {
        System.out.println((k - (num[0] % 4)) % k);
      } else {
        int ans = Math.max(0, 2 - even);
        System.out.println(Math.min(ans, min));
      }

    }
    sc.close();
  }
}
