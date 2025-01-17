public class Inventory {
    private boolean water,food,firewood;
    private String wName,aName;
    private int damage,armor;

    Inventory(){
        this.water = false;
        this.food = false;
        this.firewood = false;
        this.wName = null;
        this.damage = 0;
        this.armor = 0;

    }

    public boolean isFirewood() {
        return firewood;
    }
    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
    public boolean isWater() {
        return water;
    }
    public void setWater(boolean water) {
        this.water = water;
    }
    public boolean isFood() {
        return food;
    }
    public void setFood(boolean food) {
        this.food = food;
    }
    public String getWName() {
        return wName;
    }
    public void setWName(String wName) {
        this.wName = wName;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getaName() {
        return aName;
    }
    public void setaName(String aName) {
        this.aName = aName;
    }
}
