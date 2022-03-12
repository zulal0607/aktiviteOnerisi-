import java.util.Scanner;

public class aktiviteOnerme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter temperature : ");
        int heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("kayak yapabilirsiniz . ");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("sinemaya gidebilirsiniz . ");
            } else if (heat > 15) {
                System.out.println(" pikniğe gidebilirsiniz . ");
            }
        }
        else {
            System.out.println("yüzmeye gidebilirsiniz .");
        }
    }
}
