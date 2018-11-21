package wszechswiat;
import wszechswiat.Swiat.typPlanety;

public class Uklad {

    private String nazwaGwiazdy;
    private int odlOdZiemi;
    private Swiat.typPlanety[] planetyUkladu;

    private int predkosc = 299792;

    Uklad(String nazwaGwiazdy, int odlOdZiemi, Swiat.typPlanety[] planetyUkladu){
        this.nazwaGwiazdy=nazwaGwiazdy;
        this.odlOdZiemi=odlOdZiemi;
        this.planetyUkladu = planetyUkladu;
        System.out.print("Nazwa: " + nazwaGwiazdy + ", odleglosc od Ziemi: " + odlOdZiemi + "\n");

    }

    Uklad(Swiat.typPlanety[] planetyUkladu){
        this.planetyUkladu = planetyUkladu;
        System.out.print("\n");
    }


    public void czasSwiatla(){
        int czas;
        czas=odlOdZiemi/predkosc;
        System.out.println("Czas bez kosmitów to " + czas);
        double czasK=czas;

        for(int i=0; i < this.planetyUkladu.length; i++)
        {
            if(this.planetyUkladu[i] != null){czasK = (czasK + 0.1*czasK);}
        }


        int rozciagnietyCzas = czas << 2;
        System.out.println("Czas z kosmitami: " + czasK);
        System.out.println("Czas poczworzony: " + rozciagnietyCzas);
        System.out.println(" ");
    }

    public void przeszukanie(Swiat.typPlanety typPlanety){
        for(int i=0; i<this.planetyUkladu.length; i++){
            if(this.planetyUkladu[i].equals(typPlanety)){System.out.println("Uklad " + planetyUkladu + " posiada " + typPlanety);}
            else if(i == this.planetyUkladu.length - 1) System.out.println(" "/*"Uklad " + planetyUkladu + " nie posiada " + typPlanety*/);
        }

    }



    public void setNazwa(String nowaNazwa){this.nazwaGwiazdy=nowaNazwa;}

    public void setOdleglosc(int nowaOdl){this.odlOdZiemi=nowaOdl;}

    public void wyswietl(){System.out.print("Nazwa: " + nazwaGwiazdy + ", odleglosc od Ziemi: " + odlOdZiemi + "\n");}
}
