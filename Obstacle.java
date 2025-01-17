import java.util.Random;

public class Obstacle {
    private  String name;
    private  int damage,award,health,maxNumber;

    Obstacle(String name,int damage,int health, int award ,int maxNumber){
        this.name=name;
        this.damage=damage;
        this.award=award;
        this.health=health;
        this.maxNumber=maxNumber;

    }
    public int obstacleCount(){
        Random r = new Random();
        return  r.nextInt(this.maxNumber)+1;
    };
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public int getAward(){
        return award;
    }
    public int getHealth(){
        return health;
    }
    public int getMaxNumber(){
        return maxNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDamage(int damage){
        this.damage=damage;

    }
    public void setAward(int award){
        this.award=award;
    }
    public void setHealth(int health){
        this.health=health;
    }
    public void setMaxNumber(int maxNumber){
        this.maxNumber=maxNumber;
    }

}
