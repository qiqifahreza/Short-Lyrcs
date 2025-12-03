package temps;
import temps.lyrcs.mta;
import temps.lyrcs.mtb;


public class mtam {
    public static void amora(String[] args) throws InterruptedException {
        System.out.print("\033c");
        System.out.println("💿 Tiara Amora Mahesa Music - Menunggumu");
    
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
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("||                                         ||");
        System.out.println("=============================================");
    
        System.out.println("\033[14A");


        mta.main(args);
        System.out.print("\033[11A"+"\033[3C");
        final var blue = "\u001B[96m";
        System.out.print(blue);
        mtb.main(args);
        System.out.print("\033[2B");
    }

    
}
