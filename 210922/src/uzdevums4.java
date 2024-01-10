import java.util.Scanner;

public class uzdevums4 {

	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(System.in);
			int sk, cip, minCip;
			
			do{
				System.out.println("Ievadi skaitlis:");
				sk = scan.nextInt();
			}while(sk<0);
			scan.close();
			
			minCip = sk%10;
			while(sk>0){
				cip = sk%10;
				if((cip%2==0) && (cip<minCip)){
					minCip = cip;
				}
				sk /= 10; //sk = sk/10;
			}
			
			if((minCip%2)!=0){
				System.out.println("Pieraksta nav para ciparu!");
			}else{
				System.out.println("Mazakais para cipars ir "+minCip);
			}
			
			}catch(Exception e){
				System.out.println("Radās kļūda!");
			}

	}

}
