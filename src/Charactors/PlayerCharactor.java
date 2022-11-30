package Charactors;

import Ability.Element;

public class PlayerCharactor extends Charactor{
    private double[] skillLevel={1,1,1};
    private double ATT=0;
    private double MASTER=0;
    private double CRI=0.05;
    private double CRIDmg=0.5;
    private double ELEMENTDMG=0;
    private Element element;

    public PlayerCharactor(double[] _skillLev,double _ATT,double _MASTER, double _CRI, double _CRIDmg,double _ELEMENTDMG){
        super();
        this.skillLevel=_skillLev;
        this.ATT=_ATT;
        this.MASTER=_MASTER;
        this.CRI=_CRI;
        this.CRIDmg=_CRIDmg;
        this.ELEMENTDMG=_ELEMENTDMG;
    }

    public double[] getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(double[] skillLevel) {
        this.skillLevel = skillLevel;
    }

    public double getATT() {
        return ATT;
    }

    public void setATT(double ATT) {
        this.ATT = ATT;
    }

    public double getMASTER() {
        return MASTER;
    }

    public void setMASTER(double MASTER) {
        this.MASTER = MASTER;
    }

    public double getCRI() {
        return CRI;
    }

    public void setCRI(double CRI) {
        this.CRI = CRI;
    }

    public double getCRIDmg() {
        return CRIDmg;
    }

    public void setCRIDmg(double CRIDmg) {
        this.CRIDmg = CRIDmg;
    }

    public double getELEMENTDMG() {
        return ELEMENTDMG;
    }

    public void setELEMENTDMG(double ELEMENTDMG) {
        this.ELEMENTDMG = ELEMENTDMG;
    }

    public Element getElement(){
        return this.element;
    }

    public void setElement(Element _element){
        this.element=_element;
    }
}
