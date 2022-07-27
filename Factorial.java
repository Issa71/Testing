package factorial;

public class Factorial{
public static void main(String[] args) {

    float[] input = {120, 24, 6, 18};
    int divider = 2; 

    for(int i = 0; i < input.length; i++) {
        System.out.print(input[i]);
        divide(input[i], divider);
    }
}

public static void divide(float input, int divider) {
    if((input / divider) % 1 == 0) {
        divide(input / divider, ++divider);
    } else if(input == 1) {
        System.out.print(" = " + --divider + "!\n");
    } else {
        System.out.print(" = NONE\n");
    }
}
}