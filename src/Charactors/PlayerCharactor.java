package Charactors;

public class PlayerCharactor extends Charactor{
    int[] skillLevel;
    double ATT;
    double MASTER;
    double CRI;
    double CRIDmg;

    public PlayerCharactor(int[] _skillLev,double _ATT,double _MASTER, double _CRI, double _CRIDmg){
        super();
        this.skillLevel=_skillLev;
        this.ATT=_ATT;
        this.MASTER=_MASTER;
        this.CRI=_CRI;
        this.CRIDmg=_CRIDmg;
    }
}
