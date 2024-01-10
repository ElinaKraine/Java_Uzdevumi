import java.util.Scanner;

public class uzdevums2versija2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sk;
		System.out.print("Ievadi skaitli: ");
	    sk = scan.nextInt();
	    scan.close();
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append(sk);
	    sb.reverse();
	    System.out.println("Apgriztais skaitlis: "+sb);

	}

}
