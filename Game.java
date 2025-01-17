import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scanner=new Scanner(System.in);

public void login(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Macera oyununa hoşgeldiniz!");
    System.out.println("Oyuna başlamadan önce isminizi giriniz:");
    String playerName = scanner.nextLine();
    player = new Player(playerName);
    player.selectedCha();
    start();

}
public void start(){
  while(true){
      System.out.println();
      System.out.println("****************************************************");
      System.out.println();
      System.out.println("Eylem gerçekleştirmek için bir yer seçiniz : ");
      System.out.println("1.Güvenli Ev --->>> Size ait güvenli bir mekan, düşman yok");
      System.out.println("2.Mağara --->>> Karşınıza belki zombi çıkabilir!");
      System.out.println("3.Orman --->>> Karşınıza belki vampir çıkabilir!");
      System.out.println("4.Nehir --->>> Karşınıza belki ayı çıkabilir!");
      System.out.println("5.Mağaza --->>> Silah evya zırh alabilirsiniz!");
      System.out.println("Gİtmek istediğiniz yer : ");
      int selectLocation = scanner.nextInt();
      while(selectLocation <0 || selectLocation>5){
          System.out.println("Lütfen geçerli bir yer seçiniz....");
          selectLocation = scanner.nextInt();

      }
      switch (selectLocation){
          case 1->  location =new SafeHouse(player);
          case 2-> location=new Cave(player);
          case 3-> location=new Forest(player);
          case 4-> location=new River(player);
          case 5 -> location=new ToolStore(player);
          default -> location =new SafeHouse(player);

      }
      if(!location.getLocation()){
          System.out.println("Oyun bitti!");
          break;
      }
  }
}






}
