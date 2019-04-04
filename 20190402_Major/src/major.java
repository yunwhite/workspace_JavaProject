import java.util.*;

public class major {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String major[] = {"인터랙티브미디어과", "뉴미디어소프트웨어과", "뉴미디어솔루션과", "뉴미디어디자인과"};
		System.out.print("학번을 입력하세요 : ");
		String n = sc.next();
		String grade = n.substring(0, 1);
		String classn = n.substring(1, 2);
		System.out.println(major[Integer.parseInt(classn) / 2]);
	}
}
