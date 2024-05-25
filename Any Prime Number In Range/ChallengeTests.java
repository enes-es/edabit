import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {
  @Test
  public void test1() {
    assertEquals(true, ChallengePrime.PrimeNumberInRange(10,12));
  }
	
	@Test
  public void test2() {
    assertEquals(false, ChallengePrime.PrimeNumberInRange(62,66));
  }
	
	@Test
  public void test3() {
    assertEquals(true, ChallengePrime.PrimeNumberInRange(441,445));
  }
	
	@Test
  public void test4() {
    assertEquals(true, ChallengePrime.PrimeNumberInRange(0,2));
  }
	
	@Test
  public void test5() {
    assertEquals(false, ChallengePrime.PrimeNumberInRange(20,22));
  }
	
	@Test
  public void test6() {
    assertEquals(true, ChallengePrime.PrimeNumberInRange(4444,5555));
  }
	
	@Test
  public void test7() {
    assertEquals(false, ChallengePrime.PrimeNumberInRange(114,120));
  }
}