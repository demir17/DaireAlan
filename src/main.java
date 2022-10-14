import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, a, p = 3.14;
        System.out.println("Yarıçap giriniz ");
        r = sc.nextDouble();
        System.out.println("Merkez açısı ölçüsü giriniz");
        a = sc.nextDouble();

        double alan = (p * (r * r) * a) / 360;
        System.out.println("Alan: " + alan);




    }
}
