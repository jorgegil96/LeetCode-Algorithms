/*
Given a non-negative integer num, repeatedly add all its 
digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. 
Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/

public class 258_AddDigits {
	// Time: O(log(n)) ??
    public int addDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; //8, 11
            num /= 10;
        }
        if (sum >= 10)
            return addDigits(sum);
        else
            return sum;
    }

    // Time: O(1)
    public int addDigitsFaster(int num) {
    	if (num < 10)
            return num;
        else if (num % 9 == 0)
            return 9;
        else
            return num % 9;
    }
}