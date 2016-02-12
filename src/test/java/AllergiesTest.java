import org.junit.*;
import static org.junit.Assert.*;

public class AllergiesTest {

  @Test
  public void Allergies_Enter128_ReturnCats() {
    Allergies allergies = new Allergies();
    assertEquals("cats", allergies.checkAllergies(128));
  }

  @Test
  public void Allergies_Enter64_ReturnPollen() {
    Allergies allergies = new Allergies();
    assertEquals(" pollen", allergies.checkAllergies(64));
  }

  @Test
  public void Allergies_Enter32_ReturnChocolate() {
    Allergies allergies = new Allergies();
    assertEquals(" chocolate", allergies.checkAllergies(32));
  }

  @Test
  public void Allergies_Enter16_ReturnTomatoes() {
    Allergies allergies = new Allergies();
    assertEquals(" tomatoes", allergies.checkAllergies(16));
  }

  @Test
  public void Allergies_Enter8_ReturnStrawberries() {
    Allergies allergies = new Allergies();
    assertEquals(" strawberries", allergies.checkAllergies(8));
  }

  @Test
  public void Allergies_Enter4_ReturnShellfish() {
    Allergies allergies = new Allergies();
    assertEquals(" shellfish", allergies.checkAllergies(4));
  }

  @Test
  public void Allergies_Enter2_ReturnPeanuts() {
    Allergies allergies = new Allergies();
    assertEquals(" peanuts", allergies.checkAllergies(2));
  }

  @Test
  public void Allergies_Enter1_ReturnEggs() {
    Allergies allergies = new Allergies();
    assertEquals(" eggs", allergies.checkAllergies(1));
  }

  @Test
  public void Allergies_Enter255_ReturnAll() {
    Allergies allergies = new Allergies();
    assertEquals("cats pollen chocolate tomatoes strawberries shellfish peanuts eggs", allergies.checkAllergies(255));
  }

}
