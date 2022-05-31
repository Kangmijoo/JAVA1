import java.util.*;

public class C10_18870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] origin = new int[N];
		int[] sorted = new int[N];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < N; i++) {
			//정렬할 배열과 원본 배열에 값을 넣어줌
			sorted[i] = origin[i] = sc.nextInt();
		}
		
		//정렬할 배열 정렬
		Arrays.sort(sorted);
		
		//정렬된 배열을 순회하면서 map에 넣어줌
		int rank = 0;
		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);	//원본 배열 원소(key)에 대한 value(순위)를 갖고옴. 
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);

	}

}
