package wszechswiat;
import wszechswiat.Swiat.planety;

public class Uklad {

    private String nazwaGwiazdy;
    private double odlOdZiemi;
    private Swiat.planety[] planetyUkladu;

    private double predkosc = 299792;

    Uklad(String nazwaGwiazdy, double odlOdZiemi, Swiat.planety[] planetyUkladu){
        this.nazwaGwiazdy=nazwaGwiazdy;
        this.odlOdZiemi=odlOdZiemi;
        this.planetyUkladu = planetyUkladu;
    }

    Uklad(Swiat.planety[] planetyUkladu){
        this.planetyUkladu = planetyUkladu;
    }


    public void czasSwiatla(double odleglosc){
        double czas;
        czas=odleglosc/predkosc;
        System.out.println("Czas bez kosmitów to " + czas);
        double czasK=czas;

        for(int i=0; i < this.planetyUkladu.length; i++){
            if(this.planetyUkladu[i] != null){
                czasK = (czasK + 0.1*czasK);
            }
        }


        int poczworzony_czas_podrozy = czas << 2;
    }
}mm
