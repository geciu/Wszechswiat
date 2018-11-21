package wszechswiat;
import wszechswiat.Swiat.planety;

public class Uklad {

    private String nazwaGwiazdy;
    private double odlOdZiemi;
    Swiat.planety planetyUkladu;

    private double predkosc = 299792;

    Uklad(String nazwaGwiazdy, double odlOdZiemi, Swiat.planety planetyUkladu){
        this.nazwaGwiazdy=nazwaGwiazdy;
        this.odlOdZiemi=odlOdZiemi;
        this.planetyUkladu=planetyUkladu;
    }

    Uklad(Swiat.planety planetyUkladu){
        this.planetyUkladu=planetyUkladu;
    }


}
