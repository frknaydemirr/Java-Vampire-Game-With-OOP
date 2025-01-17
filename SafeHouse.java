public class SafeHouse extends  NormalLoc{
    public SafeHouse(Player player){
        super(player,"güvenli ev");

    }

    public boolean getLocation() {
        player.setHealty(player.getrHealth());
        System.out.println("Can Full!");
        System.out.println("Şu an Güvenli Evdesiniz");
        return true;
    }
}
