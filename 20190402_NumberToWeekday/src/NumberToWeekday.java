import java.util.*;

public class NumberToWeekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		String weekday[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("숫자를 입력하세요 : ");
		n = sc.nextInt();
		System.out.println(weekday[n - 1] + "요일");
	}

}
