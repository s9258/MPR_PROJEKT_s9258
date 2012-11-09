package pl.edu.pjwstk.s9258.statki;




public class Katamaran implements Statek {


    public double getTonaz() 
    {

        return 50000.0;

    }



 
    public String toString() 
    {

        return "Katamaran (tonaz: " + getTonaz() + ")";
}


}