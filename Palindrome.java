/*  Justin Yee
 *  COSC 311  FA19
 *  hw0926a
 *  URL:  <https://github.com/j9y/COSC-311>
 */
package hw0926;
import java.util.*;
public class Palindrome {
	public static boolean isPalindrome (String arr[]) {
		 Stack S = new Stack();
		 int max = arr.length;
		 for(int i = 0; i < max; i++) {
			 S.push(arr[i]);
		 }
		 for(int i = 0; i < max; i++) {
			if(S.pop().equals(arr[i])){
				return true;
			}
			else {
				return false;
			}
		 }
		return true;
	}
	public static void main(String args[]) {
		Scanner arrLength = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the array length: ");
		int length = arrLength.nextInt();
		String arr[] = new String[length];
		for(int i = 0; i < length; i++) {
		System.out.print("Please enter string for position "+i+" of the array: ");
		arr[i]= input.nextLine();
		}
		boolean result = isPalindrome(arr);
		System.out.println(result);
	}
}

	