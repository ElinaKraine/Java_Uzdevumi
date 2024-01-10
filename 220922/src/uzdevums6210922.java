import java.util.Scanner;

public class uzdevums6210922 {

	public static void main(String[] args) {
		int stavi, atstarpe, i=0, j=0, k=0;
		char simbols='*';
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Stavi: ");
	    stavi=scan.nextInt();
	    atstarpe = stavi;
	    scan.close();
	    
	    while(i<stavi){
	    	while(k<atstarpe){
	    		System.out.print(" ");
	    		k++;
	    	}
	    	k=0;
	    	
	    	while(j<=i){
	    		System.out.print(simbols+" ");
	    		j++;
	    	}
	    	j=0;
	    	System.out.println();
	    	atstarpe--;
	    	i++;
	    }
	    
	    
	}

}
