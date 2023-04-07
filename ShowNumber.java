import java.util.Scanner; 

public class ShowNumber {
	public static void main (String[] args) {
		Scanner getInput = new Scanner(System.in);
		System.out.println("Me diga seu nome:");
		String getName = getInput.nextLine();
		System.out.println("Olá, " + getName);
		getInput.close();
	}
}