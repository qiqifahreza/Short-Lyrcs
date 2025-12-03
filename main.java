
import lyrcs.lsa;
import lyrcs.tya;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("\033c");
        System.out.println("Rihanna - Where Have You Been");

        System.out.println("=============================================");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("=============================================");
        
        System.out.println("\033[11A");
        System.out.print("\033[3C");
        final var blue = "\u001B[96m";
        System.out.print(blue);
            lsa.main(args);
        System.out.print("\n\n");
            tya.main(args);
        System.out.print("\n\n");
            tya.main(args);
        Thread.sleep(20000);
        System.out.println("\n\n");
        final String reset = "\u001B[0m";
        System.out.print(reset);

    }
}