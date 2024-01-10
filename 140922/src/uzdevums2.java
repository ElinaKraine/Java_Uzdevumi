import java.util.Scanner;

public class uzdevums2 {

	public static void main(String[] args) {
		try{
		Scanner scan = new Scanner(System.in);
		char simbols;
		String pazinojums;
		System.out.println("Ievadi simbols (!, @, #, $, %, ^, & vai *): ");
		simbols = scan.next().charAt(0);
		scan.close();
		
		switch(simbols){
		case '!': 
			pazinojums = "Tu ievadi "+simbols+", šī simbola decimālais kods ir "+(int)simbols;
			break;
		case '@':
			pazinojums = "Tu ievadi "+simbols+", šī simbola decimālais kods ir "+(int)simbols;
			break;
		case '#':
			pazinojums = "Tu ievadi "+simbols+", šī simbola decimālais kods ir "+(int)simbols;
			break;
		case '$': 
			pazinojums = "Tu ievadi "+simbols+", šī simbola decimālais kods ir "+(int)simbols;
			break;
		case '%': 
			pazinojums = "Tu ievadi "+simbols+", šī simbola decimālais kods ir "+(int)simbols;
			break;
		case '^': 
			pazinojums = "Tu ievadi "+simbols+", šī simbola decimālais kods ir "+(int)simbols;
			break;
		case '&': 
			pazinojums = "Tu ievadi "+simbols+", šī simbola decimālais kods ir "+(int)simbols;
			break;
		case '*': 
			pazinojums = "Tu ievadi "+simbols+", šī simbola decimālais kods ir "+(int)simbols;
			break;
			default: pazinojums = "Nekorekts simbols!";
		}
		System.out.println(pazinojums);
		}catch(Exception e){
			System.out.println("Radās kļūda!");
			}
		}

	}
