package servicefinder;

/**
 * simple data structure for coordinates from Ordinance Survey Map
 * @author Jack
 */
public class Position {
    private final double eastings;
    private final double northings;
    /**
     * construct new Position
     * @param eastings coordinate on W-E axis
     * @param northings coordinate on N-S axis
     */
    public Position(double eastings,double northings){
        this.eastings = eastings;
        this.northings = northings;
    }

    /**
     * @return the eastings
     */
    public double getEastings() {
        return eastings;
    }

    /**
     * @return the northings
     */
    public double getNorthings() {
        return northings;
    }
    
}
