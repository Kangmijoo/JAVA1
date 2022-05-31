import java.util.*;

public class C10_18870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] origin = new int[N];
		int[] sorted = new int[N];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++) {
			//������ �迭�� ���� �迭�� ���� �־���
			sorted[i] = origin[i] = sc.nextInt();
		}
		
		//������ �迭 ����
		Arrays.sort(sorted);
		
		//���ĵ� �迭�� ��ȸ�ϸ鼭 map�� �־���
		int rank = 0;
		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	//���� �迭 ����(key)�� ���� value(����)�� �����. 
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);

	}

}
