import java.util.Scanner;

public class tresaisuzdevums {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String vards;
	System.out.println("Ievadi vārdu: ");
	vards = scan.nextLine();
	int mat, lat, prog, n;
	System.out.println("Ievadi matemātikas atzīmi: ");
	mat = scan.nextInt();
	System.out.println("Ievadi latviešu valodas atzīmi: ");
	lat = scan.nextInt();
	System.out.println("Ievadi programmēšanas atzīmi: ");
	prog = scan.nextInt();
	System.out.println("Ievadi neattaisnoto kavējumu skaitu: ");
	n = scan.nextInt();
	scan.close();
	
	double avg = (mat+lat+prog)/3;
	
	if (avg>=7 && n<=2){
		System.out.println(vards+": stipendija ir 80");
	}else{
		if (avg>=4 && avg<7 && n<=2){
			System.out.println(vards+": stipendija ir 40");
		}else{
			System.out.println(vards+": stipendija ir 10");
		}
	}

}
	
}