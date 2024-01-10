
public class uzdevums1 {

	public static void main(String[] args) {
		
		int[] razGads = {1999, 1993, 2001, 2005, 2003, 2011};
		String[] masinas = {"Volvo","BMW","Ford","Mazda","Mercedes"};
		char[] tips = {'B','G','D','B','E'};
		double[] cena = {1670.88,2850.99,6700.00,5440.11,12999.88};
		boolean[] rezRitenes = {true,false,false,true,false};
		
		System.out.println(razGads[1]+".gada "+masinas[2]+" maksā "+cena[0]+"EUR "
				+ "un tam rezerves ritenis "+rezRitenes[1]+" ,bet tips "+tips[2]);
		
		System.out.println(masinas[3]);
		masinas[3] = "Audi";
		System.out.println(masinas[3]);
		
		for(int i=0; i<masinas.length; i++){
			System.out.println(razGads[i]+".gada "+masinas[i]+" maksā "+cena[i]+"EUR "
					+ "un tam rezerves ritenis "+rezRitenes[i]+" ,bet tips "+tips[i]);
		}

	}

}
