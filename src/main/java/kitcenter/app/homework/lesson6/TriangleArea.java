package kitcenter.app.homework.lesson6;

/**
 * Created by annabilous on 5/13/17.
 */
public class TriangleArea {
    double aSide;
    double bSide;
    double cSide;

    public void isTriangleRight(double aSide, double bSide, double cSide) {
        if ((Math.pow(aSide, 2) + Math.pow(bSide, 2)) == Math.pow(cSide, 2)) {
            System.out.println("Triangle is right!");
        } else {
            System.out.println("Triangle is not right!");
        }
    }
}
