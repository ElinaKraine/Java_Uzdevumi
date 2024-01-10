import java.util.Scanner;

public class uzdevums5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int sk, sum=0;
	    do{
			System.out.print("Ievadi pāra skaitļu: ");
		    sk = scan.nextInt();
		    if(sk%2==0){
		    	sum += sk;
		    	System.out.println(sk);
		    }
	    }while(sk%2==0);
	    System.out.println("="+sum);
	    scan.close();

	}

}
