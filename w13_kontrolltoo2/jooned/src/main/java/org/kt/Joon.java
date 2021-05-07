package org.kt;

/**
 * Hello world!
 *
 */
public class Joon implements JoonLiides {
    public int a;

    public Joon(int a){
        this.a = a;
    }

    @Override
    public int getY(int x) {
        int y = a*x;
        return y;
    }

    
}
