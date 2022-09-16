import java.util.*;
public abstract class Character{
  private String name;
  private int order;
  private int hitPoints;
  private int armour;
  private int inititave;;
  private int temporaryHitPoints;

  public Character( String name, int hitPoints, int temporaryHitPoints){
    this.name = name;
    this.hitPoints = hitPoints;
    this.temporaryHitPoints = temporaryHitPoints;
  }
 public String getName(){
   return name;
 }
 public void setName(String name){
   this.name=name;
 }
 public void setHitPoints(int hitPoints){
   this.hitPoints =hitPoints;
 }
 public int getHitPoints(){
   return hitPoints;
 }
 public void setTempHitPoints(int temporaryHitPoints){
   this.temporaryHitPoints = temporaryHitPoints;
 }
 public int getTempHitPoints(){
   return temporaryHitPoints;
 }

  public abstract List<Character> takeDamage(List<Character> ch, int dmg);
  public abstract List<Character> addingHealthPoints(List<Character> ch , int additonalHitpoints);
  public abstract List<Character> additonalTempHitPoints(List<Character> ch, int tempHitPoints);
  public abstract List<Character> healingHealthPoints(List <Character> ch, int healed );
  public abstract List<Character> turnOrder(List<Character> ch, int turn);
  public abstract List<Character> updatetoInit(List<Character> ch, int init);
  public abstract List<Character> updateToStats(List<Character> ch, int statsistics);
  public abstract List<Character> updateToSavingThrows(List<Character> ch, int saving);


}
