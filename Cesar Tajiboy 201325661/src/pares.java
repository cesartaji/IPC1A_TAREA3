import java.util.Scanner;
public class pares {

	public static void main(String[] args) {
		int n=0;
			Scanner s=new Scanner(System.in);	
			System.out.println("Ingrese un n�mero");
			n = s.nextInt();
			if(n%2==0)
				System.out.println("El n�mero es par");
			else
				System.out.println("El n�mero es impar");
	}

}
