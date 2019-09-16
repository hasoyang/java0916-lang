package lang;

public class StringBuilderMain {

	public static void main(String[] args) {
		//StringBuilder 객체에 문자열을 추가해보고 해시코드를 확인
		//추가한 결과가 만들어지고 해시코드가 동일하다면 현재 문자열에 작업한 것입니다.
		StringBuilder sb = new StringBuilder("Hello");
		System.out.printf("sb의 해시코드 : %d\n", sb.hashCode());
		
		//sb에 java를 추가
		sb.append("java");
		//내용 출력
		//출력하는 메소드에 객체 이름을 대입하면 toString()의 결과가 출력
		System.out.printf("%s\n", sb);
		System.out.printf("sb의 해시코드 : %d\n", sb.hashCode());
		
		//작업이 끝나면 문자열 변수에 데이터를 대입하고 메모리 정리
		String result = sb.toString();
		sb = null;
	}

}
