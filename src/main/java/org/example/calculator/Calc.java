package org.example.calculator;

import java.util.logging.Logger;

abstract class Calc {
    Logger l=Logger.getLogger("kitty");
    private int n1;
    private int n2;

    public void sett(int a,int b)
    {
        this.n1=a;
        this.n2=b;
    }
    public int get1()
    {
        return n1;
    }
    public int get2()
    {
        return n2;
    }
    abstract int cal(int a,int b);
}