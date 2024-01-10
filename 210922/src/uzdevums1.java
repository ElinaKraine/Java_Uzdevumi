import java.util.Scanner;

public class uzdevums1 {

	public static void main(String[] args) {
		String tekst;
		int n=1;
		Scanner scan = new Scanner(System.in);
		
		while(n!=0){
			System.out.println("Ievadi skaitlu: ");
			n = scan.nextInt();
			
			if(n!=0){
				tekst=Integer.toString(n);
				if((tekst.charAt(0))=='-'){
					System.out.println(tekst.length()-1);
				}else{
					System.out.println(tekst.length());
				}
			}else{
				break;
			}
		}
		scan.close();

	}

}
