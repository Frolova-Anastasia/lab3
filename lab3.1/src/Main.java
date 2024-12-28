import Checkers.CaveChecker;
import Checkers.WayChecker;
import Enums.HandsProperty;
import Enums.PlaceType;
import Enums.Time;
import Exceptions.CaveisEmptyException;
import Exceptions.HandsException;
import Exceptions.WayisnotReadyException;
import LifeObjects.FriendsOfPea;
import LifeObjects.Mole;
import LifeObjects.Pea;
import NotAlive.Death;
import Records.Endings;

public class Main {
    public static void main(String[] args) {
     Pea pea = new Pea("синьор Горошек");
     FriendsOfPea chr = new FriendsOfPea("Чиполлино и Крот");
     FriendsOfPea savers = new FriendsOfPea("спасителей");
     Death death = new Death("смерти");
     FriendsOfPea everyone = new FriendsOfPea("Все трое");
     Mole mole = new Mole("Крот");
     WayChecker waychecker = new WayChecker();
     CaveChecker cavechecker = new CaveChecker();
     Endings meeting = new Endings("Хороший конец: Друзья встретились");
     Endings failedMeeting = new Endings("Плохой конец: Друзьям не удалось найти друг друга");
     String[] arrayCharacters = {"мастер Виноградинка", "кум Тыква", "профессор Груша", "прочие беглецы"};
     FriendsOfPea characters = new FriendsOfPea(String.join(", ", arrayCharacters));


     pea.understand(Time.FINALLY);
     pea.getRid(chr, death);
     pea.thankTo(Time.CONTINUOUSLY, savers);

     try {
      pea.hugTo(chr, HandsProperty.SHORT); //проверяемое исключение задается параметром handsProperty
     }
     catch (HandsException e) {
      System.out.println(e.getMessage());
     }

     pea.calmDown(Time.FINALLY);

     try {
      waychecker.checkWayAvailability();
      everyone.setPlace(PlaceType.UNDERGROUND);
      mole.dig(PlaceType.HALL);
      try {
       cavechecker.checkCaveAvailability();
       characters.hide(PlaceType.CAVE);
       meeting.display();
      } catch (CaveisEmptyException e) {
       System.out.println(e.getMessage());
       failedMeeting.display();
      }
     } catch (WayisnotReadyException e) {
      System.out.println(e.getMessage());
     }
    }
}