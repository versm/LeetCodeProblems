package P_07;

public class Solution {

    public static int reverse(int x) {

        int reverse=0;

        while (x != 0){

            int digit = x % 10;

            if(reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE/10 && digit > 7)
                return 0;
            else if(reverse < Integer.MIN_VALUE/10 || reverse == Integer.MIN_VALUE/10 && digit > 8)
                return 0;
            else
                reverse = reverse * 10 + digit;

            x=x/10;
        }
        return reverse;
    }
}
