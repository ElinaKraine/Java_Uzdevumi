import java.util.Scanner;

public class otraisuzdevums {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("Ievadi skaitlis: ");
		a = scan.nextInt();
		scan.close();
		
		if (a%2==0 && a%5==0){
			System.out.println(a+" dalas ar 2 un 5 bez atlikuma");
		}else{
			System.out.println(a+" nedalas ar 2 un 5 bez atlikuma");
		}
		
	}

}
