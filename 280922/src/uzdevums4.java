import java.util.Random;

public class uzdevums4 {

	public static void main(String[] args) {
		int summa = 0;
		int[] a = new int [11];
		Random rand = new Random();
		
		for(int i=0; i<a.length; i++){
			a[i]=rand.nextInt(10)+3;
			summa += a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println("\n Summa ="+summa);

	}

}
