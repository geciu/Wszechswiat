package wszechswiat;
import java.util.Scanner;


public class Swiat {

    public enum typPlanety{GazowyOlbrzym, SkalistyKarzel, WielkiObjekt, PlanetaWiedzy};
    public static void main (String args[]){

        typPlanety[] nowePlanety = new typPlanety[10];
        nowePlanety[0] = typPlanety.GazowyOlbrzym;
        nowePlanety[1] = typPlanety.SkalistyKarzel;
        nowePlanety[2] = typPlanety.WielkiObjekt;

        typPlanety[] innePlanety = new typPlanety[10];
        innePlanety[0] = typPlanety.GazowyOlbrzym;
        innePlanety[1] = typPlanety.WielkiObjekt;
        innePlanety[2] = typPlanety.PlanetaWiedzy;

        Uklad konstelacja = new Uklad("Konstelacja", 15600000, nowePlanety);
        konstelacja.czasSwiatla();
        konstelacja.przeszukanie(typPlanety.PlanetaWiedzy);
        konstelacja.setNazwa("Nowa Konstelacja");
        konstelacja.wyswietl();
        System.out.print("\n");

        Uklad mglawica = new Uklad("Mglawica", 678890000, innePlanety);
        mglawica.czasSwiatla();
        mglawica.przeszukanie(typPlanety.GazowyOlbrzym);
        mglawica.setNazwa("Nowa Konstelacja");
        mglawica.wyswietl();
        System.out.print("\n");


        Uklad nowy = new Uklad(innePlanety);
        String nowaNazwa;
        int nowaOdl;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj nazwę planety: ");
        nowaNazwa = odczyt.nextLine();
        System.out.println("Podaj odległość od Ziemi: ");
        nowaOdl = odczyt.nextInt();

        nowy.setNazwa(nowaNazwa);
        nowy.setOdleglosc(nowaOdl);
        nowy.czasSwiatla();

    }
}
