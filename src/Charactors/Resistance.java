package Charactors;

public class Resistance {
    private double FIRE;
    private double WATER;
    private double GRASS;
    private double ICE;
    private double WIND;
    private double THUNDER;
    private double STONE;

    public Resistance(double fire,double water,double grass,double ice,double wind, double thunder, double stone){
        this.FIRE=fire;
        this.GRASS=grass;
        this.ICE=ice;
        this.STONE=stone;
        this.THUNDER=thunder;
        this.WIND=wind;
        this.WATER=water;
    }

    public double getFIRE() {
        return FIRE;
    }

    public void setFIRE(double FIRE) {
        this.FIRE = FIRE;
    }

    public double getWATER() {
        return WATER;
    }

    public void setWATER(double WATER) {
        this.WATER = WATER;
    }

    public double getGRASS() {
        return GRASS;
    }

    public void setGRASS(double GRASS) {
        this.GRASS = GRASS;
    }

    public double getICE() {
        return ICE;
    }

    public void setICE(double ICE) {
        this.ICE = ICE;
    }

    public double getWIND() {
        return WIND;
    }

    public void setWIND(double WIND) {
        this.WIND = WIND;
    }

    public double getTHUNDER() {
        return THUNDER;
    }

    public void setTHUNDER(double THUNDER) {
        this.THUNDER = THUNDER;
    }

    public double getSTONE() {
        return STONE;
    }

    public void setSTONE(double STONE) {
        this.STONE = STONE;
    }
}
