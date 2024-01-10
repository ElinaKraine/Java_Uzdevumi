import java.util.Scanner;
import java.util.Random;

public class piektaisuzdevums {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String vards, uzvards;
		System.out.println("Ievadi savu vārdu: ");
		vards = scan.nextLine();
		System.out.println("Ievadi savu uzvārdu: ");
		uzvards = scan.nextLine();
		scan.close();
		
		int v, u, s;
		v = vards.length();
		u = uzvards.length();
		
		if (v<u){
			System.out.println(vards+""+uzvards.toLowerCase());
		}else{
			if (v>u){
				System.out.println(uzvards.toUpperCase()+""+vards);
			}else{
					String a = vards.charAt(0)+uzvards.substring(1);
					String b = uzvards.charAt(0)+vards.substring(1);
					String vards1 = a.concat(b);
					Random rand = new Random();
					s = rand.nextInt(11)-8; //[-8;2]
					System.out.println(vards1+""+s);
			}
		}

	}

}
