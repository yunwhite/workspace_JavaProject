import java.util.*;

public class NumberToWeekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		String weekday[] = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		n = sc.nextInt();
		System.out.println(weekday[n - 1] + "����");
	}

}
