import java.util.Scanner;

public class uzdevums3 {

	public static void main(String[] args) {
		Scanner dati=new Scanner(System.in);
	    int N, M, K, d=1;
	    System.out.print("Reklamu skaits pirmaja diena: ");
	    N = dati.nextInt();
	    System.out.print("Reklamu lapinu skaita pieaugums katra nakosaja diena: ");
	    K = dati.nextInt();
	    System.out.print("Reklamu skait, kas jasakraj pastkastita: ");
	    M = dati.nextInt();
	    while(N<M){
	      N=N+K;
	      d++;
	    }
	    System.out.print("Ipasnieks ir dusmigs "+d+".diena");
	    dati.close();

	}

}
