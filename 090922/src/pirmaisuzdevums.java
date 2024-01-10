import java.util.Scanner;

public class pirmaisuzdevums {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b;
		double c;
		System.out.println("Ievadi intervāla sākumu a: ");
		a = scan.nextInt();
		System.out.println("Ievadi intervāla beigas b: ");
		b = scan.nextInt();
		System.out.println("Ievadi c: ");
		c = scan.nextDouble();
		scan.close();
		
		if (c>=a && c<=b){
			System.out.println(c+" atrodas intervālā ["+a+";"+b+"]");
		}else{
			System.out.println(c+" neatrodas intervālā ["+a+";"+b+"]");
		}
		

	}

}
