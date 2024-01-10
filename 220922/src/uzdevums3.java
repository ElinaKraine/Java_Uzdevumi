import java.util.Scanner;
import java.util.Random;

public class uzdevums3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sk, sk1, meg=0;
		Random rand = new Random();
		sk = rand.nextInt(100)+1; //[1;100]
	    
	    do{
	    	System.out.print("Ievadi skaitli: ");
		    sk1 = scan.nextInt();
		    meg++;
		    if(sk==sk1){
		    	System.out.println("vienadi");
		    	break;
		    }else{
		    	if(sk>sk1){
		    		System.out.println("lielaks");
		    	}else{
		    		if(sk<sk1){
		    			System.out.println("mazaks");
		    		}
		    	}
		    }
	    }while(meg<=3);
	    
	    scan.close();
	    

	}

}
