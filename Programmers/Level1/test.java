import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		String s = "a B z";
		int n = 4;
		String answer = "";
		
        int b = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == ' ') {
        		b = 32;
        	} else {
        		b = (int)s.charAt(i)+n;
        	}
            if(b > 122 || (s.charAt(i) < 91 && b > 90)) {
            	b = b-26;
            }
            answer += (char)b;
        }
		
		System.out.println(answer);
		
	}

}
