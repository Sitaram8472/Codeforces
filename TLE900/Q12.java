import java.util.*;

public class Q12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];

      int max = -1;
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      for (int i = 0; i < n; i++) {
        max = Math.max(max, num[(i - 1 + n) % n] - num[i]);
      }

      for (int i = 0; i < n; i++) {
        max = Math.max(max, num[i] - num[0]);
      }

      for (int i = 0; i < n; i++) {
        max = Math.max(max, num[n - 1] - num[i]);
      }

      System.out.println(max);

    }
    sc.close();
  }
}
