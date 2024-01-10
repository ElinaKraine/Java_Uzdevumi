import java.util.Scanner;

public class uzdevums1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1, x2, y, solis=0.25;
	    System.out.print("Ievadi x mazako vertibu: ");
	    x1=scan.nextDouble();
	    System.out.print("Ievadi x lielako vertibu: ");
	    x2=scan.nextDouble();
	    scan.close();
	    
	    do{
	    	y = 4*Math.pow(x1, 2)+3*x1+4;
	    	System.out.println("4*"+x1+"^2+3*"+x1+"+4="+y);
	    	x1 += solis;
	    }while(x1<x2);

	}

}
