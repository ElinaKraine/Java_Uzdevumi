import java.util.Scanner;

public class uzdevums1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ievadi savu uzvārdu: ");
		String uzvards = scan.nextLine();
		System.out.println("Ievadi skolotāju vārdu: ");
		String vards = scan.nextLine();
		scan.close();
		
		int t = uzvards.length();
		int s = vards.length();
		
		if (t>s){
			System.out.println(uzvards);
		}else{
			if (t==s){
				System.out.println(uzvards+" un "+vards+" garums ir vienāds");
			}else{
				System.out.println(vards);
			}
		}
		

	}

}
