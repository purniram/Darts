public class player {

    public static void main(String[] args) {

        findingDartValue f1 = new findingDartValue();
        DartCircles dartCircle = new DartCircles();
        DartCircles dartCircle1 = new DartCircles (2,4, 6);

        f1.pointsForADartThrow(0, 0,dartCircle);
        f1.pointsForADartThrow(2, 1,dartCircle);
        f1.pointsForADartThrow(-5, 5,dartCircle1);
        f1.pointsForADartThrow(4, 4, dartCircle1);
        f1.pointsForADartThrow(2, -4,dartCircle1);
        f1.pointsForADartThrow(8, 10,dartCircle1);
        f1.pointsForADartThrow(8, 12,dartCircle1);


        DartThrowCalculate d1 = new DartThrowCalculate();
        d1.getDartPoint(0,0);
        d1.getDartPoint(2, 1);
        d1.getDartPoint(-5, 5);
        d1.getDartPoint(4, 4);
        d1.getDartPoint(2, -4);
        d1.getDartPoint(8, 10);
        d1.getDartPoint(8, 12);



    }
}
