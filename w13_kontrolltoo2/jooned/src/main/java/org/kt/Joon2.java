package org.kt;

public class Joon2 implements JoonLiides{
    public double a;
    public double c;

    public Joon2(double a, double c){
        this.a = a;
        this.c = c;
    }

    @Override
    public double getY(double x) {
        double y = a*x +c ;
        return y;
    }

    public double[] getY(double[] x){
        double[] y = new double[x.length];
        for (int  i = 0; i< x.length; i++) {
            y[i] = a*x[i]+c;
        }
        return y;
    }
    
}
