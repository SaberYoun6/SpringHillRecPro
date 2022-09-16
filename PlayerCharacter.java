import java.util.*;
public class PlayerCharacter extends Character{

  public PlayerCharacter(String name, int hitPoints, int temporaryHitPoints){
    super.setName(name);
    super.setHitPoints(hitPoints);
    super.setTempHitPoints(temporaryHitPoints);
  }
  public List<Character> takeDamage(List<Character> ch, int dmg){ 
    System.out.println("Testing conditions");
    return ch;

  }
  public List<Character> addingHealthPoints(List<Character> ch , int additonalHitpoints){
    return ch;
  }
  public List<Character> additonalTempHitPoints(List<Character> ch, int tempHitPoints){
    return ch;
  }
  public List<Character> healingHealthPoints(List <Character> ch, int healed ){
    return ch;
  }
  public List<Character> turnOrder(List<Character> ch, int turn){
    return ch;
  }
  public List<Character> updatetoInit(List<Character> ch, int init){
    return ch;
  }
  public List<Character> updateToStats(List<Character> ch, int statsistics){
    return ch;
  }
  public List<Character> updateToSavingThrows(List<Character> ch, int saving){
    return ch;
  }

  public static void main(String [] args){
    Character orkEn = new PlayerCharacter("Orken",10,0);
    List<PlayerCharacter> Orken = new List();
    Orken.add(orkEn);
    Orken.takeDamage(Orken,2); 

    

  }
}

