import java.util.Scanner;

public class uzdevums1 {

	public static void main(String[] args) {
		try{
		Scanner scan = new Scanner(System.in);
		int dzimGads, gads=2022, vecums, sk;
		System.out.println("Ievadi savu dzimšanu gadu: ");
		dzimGads = scan.nextInt();
		System.out.println("Ievadi skaitli intervālā [-1;1] : ");
		sk = scan.nextInt();
		scan.close();	
		vecums = gads-dzimGads;
		switch(sk){
	      case -1: 
	    	  vecums--;
	    	  break;
	      case 0: 
	    	  break;
	      case 1:
	    	  vecums++;
	    	  break;
	      default: System.out.println("Nederīgs intervāla"); break;
		}
		
		System.out.println("Tavs vecums ir "+vecums);
		
		}catch(Exception e){
			System.out.println("Radās kļūda!");
		}

	}

}
