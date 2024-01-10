import java.util.Scanner;
import java.text.DecimalFormat;

public class uzdevums2 {

	public static void main(String[] args) {
		double kg, procenti=5;
		int gads=2022;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".##");
		System.out.println("Kads ir svars? ");
		kg = scan.nextDouble();
		scan.close();
		
		while(kg>80){
			kg = kg - (procenti/100)*kg;
			gads++;
			System.out.println(gads+".gada bus "+df.format(kg)+"kg");
	}

	}

}
