import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {
        private int damage,healty,money,rHealth;
        private String name,cName;
        Inventory inv;
        Scanner scan = new Scanner(System.in);
        private List<String> InventoryItems;

        public Player(String name) {
            this.name = name;
            this.inv = new Inventory();
        }
        public void selectedCha(){
           switch (chaMenu()){
               case 1-> initPlayer("Samuray",5,21,15);
               case 2-> initPlayer("Okçu",7,18,20);
               case 3 ->initPlayer("Şovalye",8,24,5);
               default ->  initPlayer("Samuray",5,21,15);
               }
               System.out.println(toString());
           }

        public int chaMenu(){
            System.out.println("Lütfen karakter seçiniz:");
            System.out.println("1-Türü  :  Samuray ,\t Hasar :  5\t , Sağlık : 21\t , Para : 15 ");
            System.out.println("2-Türü  :  Okçu ,\t Hasar :  7\t , Sağlık : 18\t , Para : 20 ");
            System.out.println("3-Türü  :  Şovalye ,\t Hasar :  8\t , Sağlık : 24\t , Para : 5 ");
            System.out.println("Karakter seçiniz:");
            int chaID = scan.nextInt();
            if(chaID <1 || chaID > 3){
                System.out.println("Lütfen geçerli bi seçim yapınız(1-3)");
                chaID = scan.nextInt();
            }

            return chaID;

        }
        public int getTotalDamge(){
            return this.getDamage()+ this.getInv().getDamage();
        }
        public void initPlayer(String cName,int dmg,int healty,int money){
            setCName(cName);
            setDamage(dmg);
            setHealty(healty);
            setMoney(money);
            setrHealth(healty);
        }
    public void addInventoryItem(String item) {
        InventoryItems.add(item);
        System.out.println("Envanterdeki Eşyalar:");
        for (String InventoryItm : InventoryItems) {
            System.out.println(InventoryItm);
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
            return name;
    }
    public void setDamage(int damage) {
            this.damage = damage;
    }
    public int getDamage() {

            return damage;
    }
    public void setHealty(int healty) {
            this.healty = healty;
    }
    public int getHealty() {
            return healty;
    }
    public void setMoney(int money) {
            this.money = money;
    }
    public int getMoney() {
            return money;
    }
    public void setCName(String cName) {
            this.cName = cName;
    }
    public String getCName() {
            return cName;
    }
    public void setInv(Inventory inv) {
            this.inv = inv;
    }
    public Inventory getInv() {
            return inv;
    }
    public String toString() {
        return "Karakter{name='" + this.cName + "', money=" + this.money + ", healty=" + this.healty + ", damage=" + this.damage + "}";
    }

    public int getrHealth() {
        return rHealth;
    }
    public void setrHealth(int rHealth) {
            this.rHealth = rHealth;
    }

    public List<String> getInventoryItems() {
        return new ArrayList<String>(InventoryItems);
    }
    public void setInventoryItems(List<String> inventoryItems) {
            InventoryItems = inventoryItems;
    }
}

