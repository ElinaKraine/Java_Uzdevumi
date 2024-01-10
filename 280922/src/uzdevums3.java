
public class uzdevums3 {

	public static void main(String[] args) {
		int[] dienas = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i=0; i<dienas.length; i++){
			System.out.print((i+1)+".mēnesī ir "+dienas[i]);
			if(dienas[i]==28 || dienas[i]==30){
				System.out.print(" dienas");
			}else{
				System.out.print(" diena");
			}
			System.out.println();
		}

	}

}
