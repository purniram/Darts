import java.util.HashMap;
import java.util.Map;

public enum DartCirclesPoints {

    outsideDartCircle(10,0),
    ThirdCircle(5, 1),
    SecondCircle(1,5),
    FirstCircle(0,10);


    public final int value;
    public final int circle;

    DartCirclesPoints(int circle, int value) {
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

        public int getCircle()
        {
            return circle;
        }

}
