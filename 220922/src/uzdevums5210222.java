import java.util.Scanner;

public class uzdevums5210222 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sak, reiz=1;
		do{
			System.out.println("Ievadi pāraskaitli: ");
			sak = scan.nextInt();
		}while(sak%2 != 0);
		
		int i = sak+14;
		while(sak<=i){
			System.out.print(sak);
			reiz *= sak;
			sak += 2;
			if(sak<=i){
				System.out.print("*");
			}
		}
		System.out.print("="+reiz);
		scan.close();
	}

}
