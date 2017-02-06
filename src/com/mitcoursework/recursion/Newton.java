package com.mitcoursework.recursion;

/**
 * Created by chutungyu11 on 2/5/17.
 */
public class Newton {

    int varX = -13;
    double[] polyArray = {0.00, 0.0, 5.0, 9.3, 7.0};

    Newton(){
        // empty
    }

    private double poly(int pos, int varX) {
        double result = 0;

        System.out.println ("polyArray[pos]="+polyArray[pos]+" pos="+pos+" varX="+varX);

        // poly[x] * varX ^ x
        if (pos == 0)
            return 0;

        result = ( polyArray[pos] * Math.pow(varX, pos) ) + poly(pos-1, varX);
        System.out.println("xresult="+result);
        return result;
    }


    public void evaluatePoly(){
        // evalPoly

        if (polyArray.length == 0) {
            System.out.println("Input 0. Existing");
            return;
        }

        double result = poly(polyArray.length - 1, varX);
        System.out.println("evaluatePoly results are " + result);
    }

    public void computeDerivative(){
        // TODO

        polyArray =  new double[]{-13.39, 0.0, 17.5, 3.0, 1.0};
        evaluatePoly();
        return;
    }

    public void computeRoot() {
        // TODO

    }

    /*
        main()

     */
    public static void main(String[] args) {
        System.out.println("Let's play");
        Newton n = new Newton();
        n.evaluatePoly();
        n.computeDerivative();


    }
}
