import org.junit.Test;
import static org.junit.Assert.*;

public class SquadTest{
  @Test
  public void squad_instantiatesCorrectly_true(){
    Squad theSquad=new Squad("justice league");
    assertEquals(true, theSquad instanceof Squad);
  }
  @Test
  public void squad_instantiatesCorrectlyWithTitle_string(){
    Squad theSquad=new Squad("justice league");
    assertEquals("justice league", theSquad.getTitle());
  }
  @Test
  public void all_returnsAllInstancesOfSquad_true(){
    Squad firstSquad=new Squad("justice league");
    Squad secondSquad=new Squad("avengers");
    assertEquals(true,Squad.all().contains(firstSquad));
  }
  @Test
  public void clear_emptiesAllSquadsFromList_0(){
    Squad firstSquad=new Squad("justice league");
    Squad.clear();
    assertEquals(Squad.all().size(),0);
  }
 
  @Test
  public void find_returnsSquadWithSameId_secondSquad(){
    Squad firstSquad=new Squad("justice league");
    Squad secondSquad=new Squad("avengers");
    assertEquals(Squad.find(secondSquad.getId()),secondSquad);
  }
  @Test
  public void getHeroes_initiallyReturnsEmptyList_ArrayList(){
    Squad.clear();
    Squad mySquad=new Squad("justice league");
    assertEquals(0,mySquad.getHero().size());
  }
  @Test
  public void addHero_addsHeroesToList_true(){
    Squad mySquad=new Squad("justice league");
    Hero myHero=new Hero("batman","flying","daylight","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxKibfhDjqRIcpF7dRMWo6wm8E8keFh_Kc_BTneO9l7ZcYuhRdtQ");
    mySquad.addHero(myHero);
    assertTrue(mySquad.getHero().contains(myHero));
  }
}
