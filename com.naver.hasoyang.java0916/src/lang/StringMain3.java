package lang;

public class StringMain3 {

	public static void main(String[] args) {
		//String 클래스의 split 메소드 활용하기
		
		//구분자로 구분된 문자열을 csv라고 합니다.
		//String data = "87,67,64,89";
		String data = "98, 87,-,88";
		//위의 문자열을 ,단위로 구분해서 출력 -String 의 split이용
		//String [] split(String regexp)
		//문자열을 regexp를 기준으로 분할해서 문자열 배열을 리턴합니다.
		String []arr = data.split(",");
		//만들어진 문자열을 정수로 변환해서 합계를 출력 
		//정수 변환은 Integer.parseInt()
		int len = arr.length;
		int result = 0;
		for(int i = 0; i < len; i++)
		{
			try {
				result += Integer.parseInt(arr[i].trim());
			}catch(Exception e){
				result += 0;
			}
		}
		//trim()을 호출해서 공백을 제거
		//중간에 변환되지 않는 문자열을 삽입해서 변환되지 않는 경우에는 0으로 계산
		//예외 처리는 try ~ catch 이용
		System.out.printf("result = %d\n", result);

	}

}
