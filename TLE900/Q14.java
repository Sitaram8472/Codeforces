import java.util.*;

public class Q14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();

      if (n < 4 || n % 2 != 0) {
        System.out.println(-1);
      } else {
        long min = (n + 5) / 6;
        long max = n / 4;

        System.out.println(min + " " + max);
      }

    }
    sc.close();
  }
}
