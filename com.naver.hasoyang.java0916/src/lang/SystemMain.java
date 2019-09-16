package lang;

import java.util.GregorianCalendar;

public class SystemMain {

	public static void main(String[] args) {
		//System 클래스의 static String getProperty(String key)
		//위 메소드는 프로퍼티를 가져오는 메소드입니다.
		//os.name,  java.version
		String osname = System.getProperty("os.name");
		String javaversion = System.getProperty("java.version");
		
		System.out.println("운영체제 : " + osname);
		System.out.println("자바버전 : " + javaversion);
		
		//hello world 를 10만번 출력하는데 걸리는 시간 측정
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++)
		{
			System.out.println("hello world");
		}
		long end = System.currentTimeMillis();
		
		//소수까지 구해서 초단위로 출력
		//정수끼리 연산하면 결과는 정수
		//데이터중 하나를 실수로 변경해서 연산
		System.out.println("걸린시간 : " + ((double)end - start)/1000);
		
		//1992년 9월 13일 에서 지나온 날짜 계산하기
		//년월일을 가지고 날짜 객체를 생성
		//이 객체가 getTimeInMillis()를 호출하면 1970년 1월 1일 자정부터 지나온 시간을
		//1/1000초 단위로 리턴
		//1992년 9월 13일을 날짜 객체로 변경
		//자바에서 월은 0부터 시작합니다.
		GregorianCalendar meetday = new GregorianCalendar(1992, 8, 13);
		
		//현재 시간을 1/1000초 단위로 만들기
		long time =System.currentTimeMillis();
		//time은 밀리초 단위로 되어 있는데 일 단위로 변경 - 소수점 절삭
		//현재 시간에서 앞으로 만든 날짜를 빼고 하루로 나누어서 계산
		long day = (time- meetday.getTimeInMillis())/86400/1000;
		
		System.out.printf("지나온 날 수 :%d " ,day);
		
	}

}
