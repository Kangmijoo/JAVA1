/* ¸¸¾à Ã¹¹øÂ° Á¤¼ö°¡ È¦¼öÀÌ¸é "È¦¼ö"¸¦ Ãâ·ÂÇÏ°í, Â¦¼öÀÌ¸é "Â¦¼ö"¸¦ Ãâ·ÂÇÑ ÈÄ  "+"¸¦ Ãâ·ÂÇÑ´Ù. 
 * ±×¸®°í µÎ¹øÂ° Á¤¼ö°¡ È¦¼öÀÌ¸é "È¦¼ö"¸¦ Ãâ·ÂÇÏ°í, Â¦¼öÀÌ¸é "Â¦¼ö"¸¦ Ãâ·ÂÇÑ ÈÄ  "="À» Ãâ·ÂÇÏ°í °á°ú·Î ³ª¿À´Â °ªÀÌ È¦¼öÀÎÁö Â¦¼öÀÎÁö Ãâ·ÂÇÑ´Ù.
 * ÀÔ·Â : 2 3	 -> Ãâ·Â : Â¦¼ö+È¦¼ö=È¦¼ö		*/
import java.util.Scanner;

public class C1161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a % 2 == 0) {
			if(b % 2 == 0) {
				System.out.println("Â¦¼ö+Â¦¼ö=Â¦¼ö");
			} else {
				System.out.println("Â¦¼ö+È¦¼ö=È¦¼ö");
			}
		} else {
			if(b % 2 == 0) {
				System.out.println("È¦¼ö+Â¦¼ö=È¦¼ö");
			} else {
				System.out.println("È¦¼ö+È¦¼ö=Â¦¼ö");
			}
		}
	}

}
