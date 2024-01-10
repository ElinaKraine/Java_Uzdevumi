import java.util.Scanner;

public class uzdevums2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sk, atlikums, apgrieztais=0;
		System.out.print("Ievadi skaitli: ");
	    sk = scan.nextInt();
	    scan.close();
	    
	    do{											//sk=12;
	    	atlikums = sk%10;						//atlikums=2;
	    	apgrieztais = apgrieztais*10+atlikums; 	//apgrieztais=2
	    	sk /=10;								//sk=1;
	    }while(sk>0);
	    System.out.println("Apgrieztais skaitlis: "+apgrieztais);
		
		//int n, c;
	    //do{
	      //System.out.print("Ievadi veselu skaitli: ");
	      //n = scan.nextInt();
	      //}while(n<1);
	    //do{
	      //c = n%10;
	      //System.out.print(c);
	      //n=n/10;
	    //}while(n!=0);
	    //scan.close();

	}

}
