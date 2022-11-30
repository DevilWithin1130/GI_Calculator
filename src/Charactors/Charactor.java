package Charactors;

public class Charactor {
    private int charactorLev;
    private int charactorHp;
    private Resistance resistance;

    public Charactor(){
        this.charactorLev=90;
        this.charactorHp=10000;
        this.resistance=new Resistance(0,0,0,0,0,0,0);
    }

    public int getCharactorLev() {
        return charactorLev;
    }

    public void setCharactorLev(int charactorLev) {
        this.charactorLev = charactorLev;
    }

    public int getCharactorHp() {
        return charactorHp;
    }

    public void setCharactorHp(int charactorHp) {
        this.charactorHp = charactorHp;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public void setResistance(Resistance resistance) {
        this.resistance = resistance;
    }
}
