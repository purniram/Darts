public class DartThrowCalculate {

    public double dartDistanceFromCentre ( int x, int y)

    {
        double x1 = Double.valueOf(x);
        double y1 = Double.valueOf(y);

        double distance =   Math.sqrt(Math.pow(x1, 2)+ Math.pow(y1, 2));

        System.out.println("Distance of the dart from centre: "+ distance);
        return distance;
    }

    public int FindingDartCirclePoint (double distance)
    {


        int score = 0;
        for (DartCirclesPoints point : DartCirclesPoints.values())
        {
            if (!(distance < Double.valueOf(point.getCircle())))

            {
                score = point.getValue();
                break;
            }
            else
            {
                continue;
            }


        }
        return score;
    }

    public void getDartPoint (int x, int y)
    {

       int result = FindingDartCirclePoint(dartDistanceFromCentre(x,y));
        System.out.println ("the point got for the dart throw is :" + result);
    }


}
