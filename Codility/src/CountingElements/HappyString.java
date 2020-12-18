package CountingElements;
public class HappyString {
	public static String buildString(int a, int b, int c) {
		StringBuilder sb = new StringBuilder();
		int total = a+b+c;
		int currentA = 0;
		int currentB = 0;
		int currentC = 0;
		for(int i=0;i<total;i++) {
			if((a>=b&&a>=c&&currentA<2)||(a>0&&currentB==2)||(currentC==2&&a>0)) {
				sb.append("a");
				currentA++;
				a--;
				currentB = currentC = 0;
			}
			else if((b>=a&&b>=c&&currentB<2)||(currentA==2&&b>0)||(currentC==2&&b>0)) {
				sb.append("b");
				currentB++;
				b--;
				currentA = currentC = 0;
			}
			else if((c>=a&&c>=b&&currentC<2)||(currentA==2&&c>0)||(currentB==2&&c>0)) {
				sb.append("c");
				currentC++;
				c--;
				currentA = currentB = 0;
			}
			
		}
		//System.out.println(sb.toString());
		return sb.toString();
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 1, c = 7;
		buildString(a,b,c);

	}

}
