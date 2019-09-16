package lang;

import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
	
		String str = "Hello World!!123";
		//위 문자열에서 소문자를 전부 대문자로 변환해서 출력하기 : "HELLO WORLD!!123"
		
		String result = "";
		int len = str.length();
		
		for(int i = 0; i< len; i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				//소문자인 경우는 32를 빼서 대문자로 변
				ch = (char)(ch-32);
			}
			result += ch;
		}
		System.out.printf("result : %s\n", result);
		
		//위의 코드를 수정해서 대문자를 소문자로 변경
		
		//비밀번호는 영문 대문자 1개 소문자1개 그리고 숫자 1개 그 이외의 문자 1개
		//이상으로 구성되어야 합니다.
		//각각의 문자가 몇 개인지 셀 수 있어야 합니다.
		//str에 저장된 문자열의 대문자 개수, 소문자 개수, 숫자개수, 그 이외의 개수 세기
		
		int dae = 0;
		int so = 0;
		int su = 0;
		int etc = 0;
		//str의 대문자, 숫자 , 그 이외 문자의 개수를 세서 저장하기
		//dae =2, so = 8, su = 3, etc = 3 으로 나오도록 작성
		
		for(int i = 0; i < len; i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
				so ++;
			else if(ch >='0' && ch <='9')
				su ++;
			else if (ch >= 'A' && ch <='Z')
				dae++;
			else
				etc++;
		}
		System.out.printf("dae = %d, so = %d, su = %d, etc = %d\n", dae,so,su,etc);
		
		//dae, so , su , etc가 모두 1보다 크거나 같아면 적합한 비밀번호
		//그렇지 않다면 (4개 중의 하나라도 0이 있으면 ) 적합하지 않은 비밀번호라고 출력
		
		Scanner sc = new Scanner(System.in);
		String line;
		while(true)
		{
			
			dae = 0;
			so = 0;
			su = 0;
			etc = 0;
			
			System.out.print("문자 입력 : ");
			line = sc.nextLine();
			for(int i = 0; i < line.length(); i ++)
			{
				char ch = line.charAt(i);
			
				if(ch >= 'a' && ch <= 'z')
					so ++;
				else if(ch >='0' && ch <='9')
					su ++;
				else if (ch >= 'A' && ch <='Z')
					dae++;
				else
					etc++;
			}
			if(dae*so*su*etc!=0)
			{
				System.out.println("적합한 비밀번호");
				break;
			}
			else
			{
				System.out.println("적합하지 않은 비밀번호");
			}
		}
		sc.close();
	}

}
