package org.example;

public abstract class Test {
    private int kol;
    public int getKol(){return kol;}
    public void setKol(int kol){this.kol=kol;}

    public Test(int kol){this.kol=kol;}
    public abstract int tests();
}
