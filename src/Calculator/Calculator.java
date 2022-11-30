package Calculator;

import Charactors.Enemy;
import Charactors.PlayerCharactor;

public class Calculator {
    private PlayerCharactor player;
    private Enemy enemy;

    public Calculator(){
        this.enemy=new Enemy();
        this.player=new PlayerCharactor(new double[]{1,1,1},0,0,0,0,0);
    }

    public double[] getBaseCalculation(){
        double[] res={0,0,0};
        double baseDmg= player.getATT()* (player.getCRIDmg()+1) * (player.getELEMENTDMG()+1)*((100+player.getCharactorLev())/(100+player.getCharactorLev()+enemy.getCharactorLev()))*player.getResistance().getValue(player.getElement());
        for(int i=0;i<3;i++){
            res[i]=getPlayer().getSkillLevel()[i]*baseDmg;
        }

        return res;
    }

    public double[] getExpectation(){
        double[] res=getBaseCalculation();

        for(int i=0;i<3;i++){
            res[i]=res[i]+ player.getCRI()+res[i]/(player.getCRIDmg()+1)*(1- player.getCRI());
        }

        return res;
    }

    public PlayerCharactor getPlayer() {
        return player;
    }

    public void setPlayer(PlayerCharactor player) {
        this.player = player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}
