import java.util.*;

public class MinTheMaxTwoArrays {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }

    public static int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long left = 1, right = (long)10e10;
        long ans = right;

        long lcm = (long)((long)divisor1 * (long)divisor2) / gcd(divisor1, divisor2);
        
        // Perform Binary Search
        while (left <= right) {
            // Determine the middle element
            long mid = left + (right - left)/2;

            long a = (mid - mid/divisor1);
            long b = (mid - mid/divisor2);
            long c = mid - (mid/divisor1) - (mid/divisor2) + (mid/lcm);

            if (a >= uniqueCnt1 && b >= uniqueCnt2 && a+b-c >= uniqueCnt1+uniqueCnt2) {
                ans = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }

        return (int)ans;
    }
    public static void main(String[] args) {
        int divisor1 = 2, divisor2 = 7, uniqueCnt1 = 1, uniqueCnt2 = 3;

        System.out.println(minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2));
    }
}