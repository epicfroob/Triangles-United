package servicefinder;

//import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Jack
 */
public class ServiceFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /**
     * find the distance between 2 positions using pythagoras theory
     * @param pos1 first position
     * @param pos2 second position
     * @return the distance
     */
    double findDistance(Position pos1,Position pos2){
        double distance;
        double a = pos1.getEastings() - pos2.getEastings();
        double b = pos1.getNorthings() - pos2.getNorthings();
        distance = Math.sqrt((a*a)+(b*b));
        return distance;
    }
    /**
     * placeholder for importing position data from database
     */
    void importLocation(){
        
    }
    /**
     * get input of postcode following UK style of postcode Regular Expression supplied by government
     * @return 
     */
    Position requstPostcode(){
        Pattern pattern = Pattern.compile("^([Gg][Ii][Rr] 0[Aa]{2})|((([A-Za-z][0-9]{1,2})|(([A-Za-z]"
                + "[A-Ha-hJ-Yj-y][0-9]{1,2})|(([A-Za-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y][0-9]?[A-Za-z])))) [0-9][A-Za-z]{2})$");
        //Scanner in = new Scanner(System.in);
        /*
        TODO get input from UI
        */
        
        //String postcode = in.next(pattern);
        /*
        TODO add look up of postcode in database for position
        */
        return new Position(0,0); //placeholder
    }
    
    
}
