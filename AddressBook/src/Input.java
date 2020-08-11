
import java.util.Scanner;

public class Input {
	Scanner scan;
	Friend[] array;
	
	public Input(Friend[] array) {
		this.scan = new Scanner(System.in);
		this.array = array;
	}
	
	public void input() {
		Add add = new Add(array);
		Search search = new Search(array);
		Show show = new Show();
		
		int count=0;
		
		System.out.println("\t\t\t\t\t\t\t\t<<�ּҷ� ���� ���α׷�>>\t\t\t\t\t\t\t\t");
		
		do {
			System.out.print("1. �߰�  2. �˻�  3. ��� ����  4. ���� \n");
			System.out.print("���� : ");
			int no = scan.nextInt();

			switch(no) {
			case 1 : count++; add.add(count); break;
			case 2 :	search.search(count); break;
			case 3 : show.show(array, count); break;
			default : System.exit(-1);
			}
			
		} while( count<=10);
		
	}	
}