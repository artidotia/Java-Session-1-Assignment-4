
public class ExpressionValues {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int res; 
		res = x + y * 2;
		System.out.println("Output of x+y*2 = "+ res);
		res = x - y + 2;
		System.out.println("Output of x-y+2 = "+ res);
		res = (x+y)*2;
		System.out.println("Output of (x+y)*2 = "+ res);
		res = y%x;
		System.out.println("Output of y%x = "+ res);
	}
}
