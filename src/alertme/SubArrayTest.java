import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SubArrayTest 
{
  	final Integer[] targetArray = {2, 3, 4, 5};
		final Integer[] subArray = {4, 5};
		
	@Test
	public void t1()
	{
		boolean isValid = SubArray.validateArrays(targetArray, subArray);
		assertEquals("Arrays are valid for comparison", isValid, true);
	}
	@Test
	public void t2()
	{
		int offset = SubArray.getSubArrayOffset(targetArray, subArray);
		assertEquals("Offset test: should be 2", offset, 2);
	}
	@Test(expected=AssertionError.class)
	public void t3()
	{
		int offset = SubArray.getSubArrayOffset(targetArray, subArray);
		assertEquals("Offset test: this should fail", offset, 3);
	}

	public static void main(String[] args)
	{
	}
}
