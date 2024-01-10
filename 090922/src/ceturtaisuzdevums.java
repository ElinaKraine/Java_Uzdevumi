import java.util.Scanner;

public class ceturtaisuzdevums {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Ievadi 1.nogriežņū garumu: ");
		n1 = scan.nextInt();
		System.out.println("Ievadi 2.nogriežņū garumu: ");
		n2 = scan.nextInt();
		System.out.println("Ievadi 3.nogriežņū garumu: ");
		n3 = scan.nextInt();
		scan.close();
		
		if (n1<=(n2+n3) && n2<=(n1+n3) && n3<=(n2+n3)){
			System.out.println("Var izveidot trijsturis");
		}else{
			System.out.println("Nevar izveidot trijsturis");
		}

	}

}
