import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ChallengeTest {
  @Test
  public void test1() {
    assertEquals("Boom!", Challenge.sevenBoom(new int[]{2, 6, 7, 9, 3}));
  }
	
  @Test
  public void test2() {
    assertEquals("there is no 7 in the array", Challenge.sevenBoom(new int[]{33, 68, 400, 5}));
  }
	
  @Test
  public void test3() {
    assertEquals("there is no 7 in the array", Challenge.sevenBoom(new int[]{86, 48, 100, 66}));
  }
	
  @Test
  public void test4() {
    assertEquals("Boom!", Challenge.sevenBoom(new int[]{76, 55, 44, 32}));
  }
	
  @Test
  public void test5() {
    assertEquals("Boom!", Challenge.sevenBoom(new int[]{35, 4, 9, 37}));
  }

  @Test
  public void testDigitizer() {
    int[] assert1 = Challenge.Digitizer(12345);
    int[] assert2 = Challenge.Digitizer(12);
    int[] assert3 = Challenge.Digitizer(-12);

    boolean passed1 = Arrays.equals(new int[]{1,2,3,4,5}, assert1);
    boolean passed2 = Arrays.equals(new int[]{1,2}, assert2);
    boolean passed3 = Arrays.equals(new int[]{1,2}, assert3);

    assertEquals(true, passed1);
    assertEquals(true, passed2); 
    assertEquals(true, passed3);
  }

  @Test
  public void testDigitizerHelper() {
    LinkedList<Integer> expected = new LinkedList<Integer>();

    expected.add(4);
    expected.add(3);
    expected.add(2);
    expected.add(1);


    assertEquals(expected, Challenge.DigitizerHelper(1234));
  }

  @Test
  public void testDigitizer_Experimental(){
    ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,3,4));

    assertEquals(expected, Challenge.Digitizer_Experimental(1234));
  }
}