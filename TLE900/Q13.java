import java.util.*;

public class Q13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long[] num = new long[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      long ans = 0;
      long curr = 0;

      for (int i = 0; i < n; i++) {
        if (num[i] != 0 && curr == 0) {
          curr = 1;
          ans++;
        }
        if (num[i] == 0 && curr == 1) {
          curr = 0;
        }
      }
      if (ans == 0) {
        System.out.println(0);
      } else if (ans == 1) {
        System.out.println(1);
      } else {
        System.out.println(2);
      }

    }
    sc.close();
  }
}
