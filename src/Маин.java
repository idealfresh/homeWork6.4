import java.util.Scanner;
import java.util.Arrays;
public class ���� {

	public static void main(String[] args) {
		// �������� ��������, ����� ����� ����� � ����� �� ����� � ����� ������� �� ������� �������� �����.

		int[]massive={1,3,5,7,9,2,4,6,8,10};
		Scanner scan=new Scanner(System.in);
		System.out.println("Imput number form 1-10: ");		
		int x= scan.nextInt();
		
		for(int i=0;i<massive.length;i++){
			if (massive[i]== x){
				System.out.println(x);
			}
		}
		
	}

}
