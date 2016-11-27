import java.util.Scanner;

/**
 * 
 */

/**
 * Java Static Initializer Block
 * 
 * 
 * @author HowardYang
 *
 */


public class Solution10 {


	private static int B;
	private static int H;
	private static boolean flag;
	
	static {
		Scanner input = new Scanner(System.in);
		B = input.nextInt();
		H = input.nextInt();
		if (B > 0 || H > 0) {
			flag = true;
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
		input.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}

}
