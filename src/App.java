import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int horas = sc.nextInt();
            int minuto = sc.nextInt();

            horas = horas / 30;
            minuto = minuto / 6;

            DecimalFormat df = new DecimalFormat("00");

            System.out.println(df.format(horas) + ":" + df.format(minuto));

        }
        sc.close();
    }
}
