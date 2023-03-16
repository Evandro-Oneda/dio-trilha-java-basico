// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();
		sc.close();
 
        media = ( A  * 3.5 +  B   * 7.5)/11; 

        System.out.printf("MEDIA = " + media   );
        System.out.println();
    }
}