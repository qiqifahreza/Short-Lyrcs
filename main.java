import java.io.IOException;
import java.util.Scanner;
import temps.mtam;
import temps.whyb;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (Scanner s = new Scanner(System.in)) {
            String n = "\033[1D";
            String c = "\033c";
            int m = 1000;
            System.out.print(c);
            System.out.println("===============================");
            System.out.println("|| Short Music Lyrics Player ||");
            System.out.println("===============================");
            System.out.println("\n1. Play 'Where Have You Been' by Rihanna");
            System.out.println("2. Play 'Menunggumu' by Tiara Amora Mahesa Music");
            
            System.out.print("\n>>> ");
            int i = s.nextInt();
            if (i == 1) {
                System.out.print("\nPlaying 'Where Have You Been' by Rihanna...   ");
                System.out.print("3");Thread.sleep(m);System.out.print(n);System.out.print("2");Thread.sleep(m);System.out.print(n);System.out.print("1");Thread.sleep(m);System.out.print("0"+c);
                whyb.rihanna(args);
            }
            else if (i ==2) {
                System.out.print("\nPlaying 'Menunggumu' by Tiara Amora Mahesa Music...   ");
                System.out.print("3");Thread.sleep(m);System.out.print(n);System.out.print("2");Thread.sleep(m);System.out.print(n);System.out.print("1");Thread.sleep(m);System.out.print("0"+c);
                mtam.amora(args);
            }
        }
        final var reset = "\u001B[0m";
        System.out.print(reset);
    }       
}
