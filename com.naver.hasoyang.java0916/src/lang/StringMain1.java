package lang;

public class StringMain1 {

	public static void main(String[] args) {
		//문자열 상수를 이용해서 문자열 객체를 생성
		String string = "Hello";
		//해시코드를 출력
		System.out.printf("string : %d\n", string.hashCode());
		//문자열에 다른 문자열을 추가 : 원본에 추가되는 것이 아니고 복사를 해서 
		//다른 곳에서 연산한 후 그 결과를 리턴합니다.
		string = string + "java";
		//해시코드를 출력 - 이전과 다른 해시코드가 출력됩니다.
		System.out.printf("string : %d\n", string.hashCode());
		
		//String 의 내용을 한 글짜씩 출력
		//length와 charAt만 사용
		int len = string.length();
		//i < len 이 i < string.length()를 호출하는 것보다 좋은 이유
		//메소드를 호출하면 새로운 메모리영역(Stack)을 만들어서 코드를 실행 한 후
		//그 결과를 가지고 돌아오는 구조입니다.
		//동일한 결과를 가져오는 메소드를 반복문안에서 여러 번 호출하는 것은 메모리 낭비도
		//발생하지만 속도도 느려질 수 있습니다.
		// 동일한 결과를 가져오는 메소드를 호출할 때는 한 번만 호출해서 결과를 지역변수에
		//저장하고 실행하는 것이 효율적입니다.
		for(int i = 0; i < len; i++)
		{
			System.out.printf("%c\n", string.charAt(i));
		}
	}

}
