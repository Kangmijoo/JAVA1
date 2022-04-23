/* 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬. 
 * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 * 입력 : ["sun", "bed", "car"]	1	-> 출력 : ["car", "bed", "sun"]
 * 입력 : ["abce", "abcd", "cdx"]	2	-> 출력 : ["abcd", "abce", "cdx"] */
import java.util.*;

public class 문자열_내_마음대로_정렬하기 {

	class Solution {
	    public String[] solution(String[] strings, int n) {
	        String[] answer = new String[strings.length];
	        
	        //정렬을 위한 list 만들어줌(임의로 맨 앞에 n번째 알파벳 붙여줌)
	        ArrayList<String> list = new ArrayList<>();
	        for(int i = 0; i < strings.length; i++) {
	            list.add(strings[i].charAt(n) + strings[i]);
	        }
	        
	        //정렬
	        Collections.sort(list);
	        
	        //임의로 붙여줬던 알파벳 없애고 출력
	        for(int i = 0; i < strings.length; i++) {
	            answer[i] = list.get(i).substring(1, list.get(i).length());
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
