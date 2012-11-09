package pl.edu.pjwstk.s9258.statki;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;




public class Main {

 
    public static void main(String[] args) {

        

        List<Statek> StatkiList = new ArrayList<Statek>();




        StatkiList.add(new RORO());
        StatkiList.add(new Pasazerski());
        StatkiList.add(new Katamaran());
      




        System.out.println("Lista:");

       for (Statek Statki : StatkiList)
        {
 
            System.out.println(Statki);

        }


       System.out.println("----------------------------------------");
       
       
        Set<Statek> StatkiSet = new HashSet<Statek>();
        StatkiSet.add(new RORO());
        StatkiSet.add(new Pasazerski());
        StatkiSet.add(new Katamaran());

        

        System.out.println("\nZbior:");

        for (Statek Statek : StatkiSet) 
        {

            System.out.println(Statek);
 
        }


        System.out.println("----------------------------------------");

        Map<String, Statek> StatkiMap = new HashMap<String, Statek>();

        StatkiMap.put("StaryPasazerski", new Pasazerski());

        StatkiMap.put("StaryRORO", new RORO());
 
        StatkiMap.put("StaryKatamaran", new RORO());




        System.out.println("\nMapy:");

        for (String key : StatkiMap.keySet())
        {

            System.out.println(key + " : " + StatkiMap.get(key));
 
        }
    }

}