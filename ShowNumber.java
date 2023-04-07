import java.util.Scanner; 

public class ShowNumber {
	public static void main (String[] args) {
		Scanner getInput = new Scanner(System.in);
		System.out.println("Insira um número");
		double getNumber = getInput.nextDouble();
		System.out.printf("O número informado foi {%f}.", getNumber);
		getInput.close();
	}
}