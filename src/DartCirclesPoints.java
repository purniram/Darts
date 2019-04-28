import java.util.HashMap;
import java.util.Map;

public enum DartCirclesPoints {

    outsideDartCircle(0,0),
    ThirdCircle(1, 1),
    SecondCircle(2,5),
    InnermostCircle(3,10);


    public final int value;
    public final int circle;

     private DartCirclesPoints(int circle,int value) {
            this.value = value;
            this.circle = circle;
        }

    private static final Map<Integer, DartCirclesPoints> dartMap = new HashMap<Integer, DartCirclesPoints>();

     static
    {
        for (DartCirclesPoints dartCirclesPoints : DartCirclesPoints.values())
            dartMap.put(dartCirclesPoints.circle, dartCirclesPoints);
    }


    public static DartCirclesPoints from(int value)
    {
        return dartMap.get(value);
    }


        public int getValue ()
        {
            return value;
        }

}
