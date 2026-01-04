import java.util.*;

public class Q15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int ans = 0;
      for (int i = n - 2; i >= 0; i--) {
        while (num[i] >= num[i + 1]) {
          num[i] /= 2;
          ans++;
          if (num[i] <= 0) {
            break;
          }
        }
        if (num[i] == 0 && num[i + 1] == 0) {
          ans = -1;
          break;
        }
      }

      System.out.println(ans);

    }
    sc.close();
  }
}
