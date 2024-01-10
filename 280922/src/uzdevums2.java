
public class uzdevums2 {

	public static void main(String[] args) {
		double[] cena={10.00, 22.52, 21.69, 26.09, 30.99, 15.30};
		double summa=0;
		
		//Izvada elementus no 0 līdz beigām
		for(int i=0; i<cena.length; i++){
			System.out.println(cena[i]+"EUR");
		}
		
		System.out.println();
		//Izvada no beigām līdz 0
		for(int i=cena.length-1; i>=0; i--){
			System.out.println(cena[i]+"EUR");
			summa +=cena[i];
		}
		System.out.println("Summa = "+summa);
		
		//Lielākā elementa meklešana
		double max = cena[0];
		for(int i =1; i<cena.length; i++){
			max=Math.max(max, cena[i]);
			//vai
			//if(cena[i]>max){ max=cena[i]; }
		}
		System.out.println("Max = "+max);

	}

}
