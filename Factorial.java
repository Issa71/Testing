

public class Factorial{
	
public static void main(String[] args) {

	
System.out.println(Factorial(120));

}

public static int Factorial(int value) {
	
	for (int i=2; value!= i  ; i++) {
		
		value = value/i;
		
	}
	return value;
}

}