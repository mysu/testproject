
import java.util.Scanner ;
//this is a test
public class test {
	public static void main(String[] args){
	int edad;
	String nombre ;
	Scanner print = new Scanner (System.in) ;
	System.out.println("Cual es su nombre ") ;
		nombre= print.next();
	System.out.println("Digite la edad ")
		edad=print.nextInt();
	System.out.println("la edad de "+nombre+" es " + edad);
	}
}