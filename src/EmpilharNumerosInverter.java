import java.util.Scanner;

public class EmpilharNumerosInverter {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int[] array = new int[10];
		
		for(int numero = 0; numero<array.length; numero++) {
			String valorDigitado = leitor.nextLine();
			array[numero] = Integer.parseInt(valorDigitado);
		}
		
		lerArray(array);
		leitor.close();

	}
	
	
	public static void lerArray(int[] array) {
		 for(int i = 9; i>=0; i--) {
			 System.out.println(array[i]);
		 }
	}
	
}
