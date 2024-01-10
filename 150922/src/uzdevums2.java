
public class uzdevums2 {

	public static void main(String[] args) {
		boolean list, lietussargs, slapjasKajas = false;
		String pazinojums;
		list = true;
		lietussargs = false;
		if(list==true && lietussargs==true){
			pazinojums = "Būšu sauss!";
			slapjasKajas = false;
		}else{
			if (list==true && lietussargs != true){
				pazinojums = "No lietus nebaidos!";
				slapjasKajas = true;
			}else{
				pazinojums = "Laiks ir labs!";
				slapjasKajas = false;
			}
		}
		System.out.println(pazinojums);
		System.out.println(slapjasKajas);

	}

}
