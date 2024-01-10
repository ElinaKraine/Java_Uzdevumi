import java.util.Scanner;

public class uzdevums4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=2, pusG, men=0;
		System.out.print("Ievadi par, cik pusgadu periodu vēlies uzzināt trušu skaitu? ");
	    pusG = scan.nextInt();
	    scan.close();
	    System.out.print("Sākumā saimniekam ir "+t+" truši");
	    
	    do{
	    	pusG--;
	    	men += 6;
	    	t += (t/2)*4;
	    	System.out.println("Pēc "+men+".mēnešiem būs "+t+" truši");
	    }while(pusG>0);

	}

}
