import java.util.Scanner;

public class ToolStore extends NormalLoc {
    ToolStore(Player player) {
        super(player, "Mağaza");

    }

    public boolean getLocation() {
        System.out.println("Para :" + player.getMoney());
        System.out.println("1. Silahlar");
        System.out.println("2. Zırhlar");
        System.out.println("3. Çıkış");
        System.out.println("Seçiminiz:");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool) {
            case 1 -> {
                selItemID = weaponMenu();
                buyWeapon(selItemID);
            }
            case 2 -> {
                selItemID = armorMenu();
                buyWeapon(selItemID);
            }

        }
        return true;
    }

    public int armorMenu() {
        System.out.println("1. Hafif Zırh < Para : 15 - Hasar : 2> ");
        System.out.println("2. Orta Zırh < Para : 25 - Hasar : 3> ");
        System.out.println("3. Ağır Zırh < Para : 40 - Hasar : 7> ");
        System.out.println("4. Çıkış ");
        System.out.println("Zırh  Seçiniz : ");
        int selArmorID = scan.nextInt();
        return selArmorID;
    }

    public void buyArmor(int selItemID) {
        int avoid = 0, price = 0;
        String aName = null;
        switch (selItemID) {
            case 1 -> {
                avoid = 2;
                price = 15;
                aName = "Hafif Zırh";
            }
            case 2 -> {
                avoid = 3;
                price = 25;
                aName = "Orta Zırh";
            }
            case 3 -> {
                avoid = 5;
                price = 40;
                aName = "Ağır Zırh";
            }
            case 4 -> {
                System.out.println("Çıkış yapılıyor!");
                return; //metodu sonlandırmak için return kullandık sonuçta if blokları da metodun içinde alt kısımıdaki  case yapısı bitse de çalışmaya devam edecek...
            }
            default -> {
                System.out.println("Geçersiz işlem!");
                return;
            }
        }
        if (price >= 0) {
            if (player.getMoney() > price) {
                player.getInv().setArmor(avoid);
                player.getInv().setaName(aName);
                player.setMoney(player.getMoney() - price);
                System.out.println(aName + "Satın alındı\t Engellenen Hasar : " + player.getInv().getArmor());
                System.out.println("Kalan Para : " + player.getMoney());
            } else {
                System.out.println("Bakiye yetersiz!");
            }
        }
    }


    public int weaponMenu() {
        System.out.println("1. Tabanca < Para : 25 - Hasar : 2> ");
        System.out.println("2. Kılıç < Para : 35 - Hasar : 3> ");
        System.out.println("3. Tüfek < Para : 45 - Hasar : 7> ");
        System.out.println("4. Çıkış ");
        System.out.println("Silah Seçiniz : ");
        int selWeaponID = scan.nextInt();
        return selWeaponID;

    }

    public void buyWeapon(int itemID) {
        int damage = 0, price = 0;
        String wName = null;
        switch (itemID) {
            case 1 -> {
                damage = 2;
                price = 25;
                wName = "Tabanca";
            }
            case 2 -> {
                damage = 3;
                price = 35;
                wName = "Kılıç";
            }
            case 3 -> {
                damage = 7;
                price = 45;
                wName = "Tüfek";
            }
            case 4 -> {
                System.out.println("Çıkış yapılıyor!");
                return; //metodu sonlandırmak için return kullandık sonuçta if blokları da metodun içinde alt kısımıdaki  case yapısı bitse de çalışmaya devam edecek...
            }
            default -> {
                System.out.println("Geçersiz işlem!");
                return;
            }

        }
        if (price >= 0) {
            if (player.getMoney() > price) {
                player.getInv().setDamage(damage);
                player.getInv().setWName(wName);
                player.setMoney(player.getMoney() - price);
                System.out.println(wName + "Satın alındı" + "\nÖnceki Hasar : " + player.getDamage() + "\nYeni hasarınız: " + player.getTotalDamge());
                System.out.println("Kalan Para : " + player.getMoney());
            } else {
                System.out.println("Bakiye yetersiz!");
            }
        }


    }



}
