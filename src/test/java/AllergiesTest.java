import org.junit.*;
import static org.junit.Assert.*;

public class AllergiesTest {

  @Test
  public void Allergies_Enter128_ReturnCats() {
    Allergies allergies = new Allergies();
    assertEquals("cats", coinSort.checkChange(128));
  }
