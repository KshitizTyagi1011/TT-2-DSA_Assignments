//Assuming A2 is bigger
import java.io.*;
import java.util.*;

class diff_arrays {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a1 size: ");
    int n1 = scn.nextInt();
    int a1[] = new int[n1];

    System.out.println("Enter a1 values: ");
    for (int i = 0; i < a1.length; i++) {
      a1[i] = scn.nextInt();
    }
    System.out.println("Enter a2 size: ");
    int n2 = scn.nextInt();
    int a2[] = new int[n2];
    System.out.println("Enter a2 values: ");
    for (int i = 0; i < a2.length; i++) {
      a2[i] = scn.nextInt();
    }

    int diff[] = new int[n2];
    int c = 0;
    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = diff.length - 1;

    while (k >= 0) {
      int d = 0;
      int a1v = (i >= 0 ? a1[i] : 0);
      if (a2[j] + c >= a1v) {
        d = a2[j] + c - a1v;
        c = 0;
      } else {
        d = a2[j] + 10 + c - a1v;
        c = -1;
      }

      diff[k] = d;
      i--;
      j--;
      k--;
    }

    int idx = 0;
    while (idx < diff.length && diff[idx] == 0) {
      idx++;
    }
    System.out.println("diff: ");
    while (idx < diff.length) {
      System.out.println(diff[idx++]);

    }
  }
}