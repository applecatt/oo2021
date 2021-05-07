package org.kt;

/**
 * Hello world!
 *
 */
public class Joon implements JoonLiides {
    public double a;

    public Joon(double a){
        this.a = a;
    }

    @Override
    public double getY(double x) {
        double y = a*x;
        return y;
    }

    
}
