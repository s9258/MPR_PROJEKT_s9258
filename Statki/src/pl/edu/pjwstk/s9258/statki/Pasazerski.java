package pl.edu.pjwstk.s9258.statki;




public class Pasazerski implements Statek {


    public double getTonaz() 
    {

        return 100000.0;

    }



 
    public String toString() 
    {

        return "Pasazerski (tonaz: " + getTonaz() + ")";
}


}