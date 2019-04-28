public class player {

    public static void main(String[] args) {

        findingDartValue f1 = new findingDartValue();
        DartCircles dartCircle = new DartCircles();
        DartCircles dartCircle1 = new DartCircles (2,4, 6);

        f1.pointsForADartThrow(0,0,dartCircle);

        f1.pointsForADartThrow(0, 0,dartCircle);
        f1.pointsForADartThrow(2, 1,dartCircle);

        f1.pointsForADartThrow(-5, 5,dartCircle1);
        f1.pointsForADartThrow(4, 4, dartCircle1);
        f1.pointsForADartThrow(2, -4,dartCircle1);
        f1.pointsForADartThrow(8, 10,dartCircle1);
        f1.pointsForADartThrow(8, 12,dartCircle1);




    }
}
