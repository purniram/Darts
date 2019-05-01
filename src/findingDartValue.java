import java.util.Collection;
import java.util.HashMap;

public class findingDartValue {

    public int findingDartCircle(int x, int y, DartCircles dartCircles) {


        if (isDartInsideTarget(x, y, dartCircles.dartCircle3)) {

            if(isDartInsideTarget(x, y, dartCircles.dartCircle2))
            {
                if(isDartInsideTarget(x,y,dartCircles.dartCircle1))
                    return 3;
                return 2;
            }
                return 1;
        }

        return 0;

    }

    public boolean isDartInsideTarget (int x, int y, int radius)
    {
        if ( Math.abs(x) <= radius && Math.abs(y) <= radius )

            return true;

        return false;
    }



    public void pointsForADartThrow (int x, int y , DartCircles dartCircles)
    {
       int value = findingDartCircle(x, y,dartCircles);


       switch (value)
       {
           case 0:
               System.out.println ("the player has earned :"+
                       0+" point");
               break;

           case 1:
               System.out.println ("the player has earned :" +
                       DartCirclesPoints.ThirdCircle.getValue()+ " point");
               break;

           case 2:
               System.out.println ("the player has earned :" +
                       DartCirclesPoints.SecondCircle.getValue() +" points");
               break;

           case 3:
               System.out.println ("the player has earned :" +
                       DartCirclesPoints.FirstCircle.getValue() + " points");
               break;

       }
    }

}