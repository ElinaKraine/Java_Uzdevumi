import java.util.Scanner;

public class uzdevums3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double kg, aCena=0.26 , bCena=0.89 , buCena=0.68 , sum=0;
		String aug;
		System.out.println("Ievadi vārdiski vienu no augļiem (banāns, ābols, bumbieris): ");
		aug = scan.nextLine();
		System.out.println("Ievadi daudzums(kg): ");
		kg = scan.nextDouble();
		scan.close();
		
		switch(aug){
			case "ābols":
				sum=kg*aCena;
				break;
			case "banāns":
				sum=kg*bCena;
				break;
			case "bumbieris":
				sum=kg*buCena;
				break;
		}
		System.out.println(sum);

	}

}
