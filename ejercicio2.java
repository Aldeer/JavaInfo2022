import java.util.Scanner;
public class ejercicio2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        numero1 = in.nextInt();
        numero2 = in.nextInt();
        in.close();
        System.out.println(suma(numero1, numero2));
    }
    public static int suma(int num1, int num2){
        return num1 + num2;
    }
}
