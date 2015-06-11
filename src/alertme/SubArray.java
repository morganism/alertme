import java.util.Arrays;
import java.util.Collections;

public class SubArray 
{
	private static final int INVALID_ARRAY_RESULT = -1;
	
	/**
	 * 
	 * @param targetArray
	 * @param subArray
	 * @return Offset of subArray in targetArray
	 */
	public static int getSubArrayOffset(Integer[] targetArray, Integer[] subArray)
	{
		if (!validateArrays(targetArray, subArray))
		{
			return INVALID_ARRAY_RESULT;
		}
		
	    return Collections.indexOfSubList(Arrays.asList(targetArray), Arrays.asList(subArray));
	}	

	/**
	 * ensure target array and sub array are valid together
	 * subArray must be smaller in length than the targetArray
	 * <b>and</b> both must not be empty arrays
	 * @param targetArray
	 * @param subArray
	 * @return
	 */
	public static boolean validateArrays(Integer[] targetArray, Integer[] subArray)
	{
		if (subArray.length >= targetArray.length)
		{
			return false; // sub array greater than target
		}
		else if (subArray.length == 0 ||  targetArray.length == 0)
		{
			return false; // either array is zero width
		}
		
		return true;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		final Integer[] targetArray = {2, 3, 4, 5};
		final Integer[] subArray = {4, 5};
		
		System.out.println("Using targetArray = " + Arrays.toString(targetArray));
		System.out.println("Using subArray = " + Arrays.toString(subArray));

		int offset = getSubArrayOffset(targetArray, subArray);
		System.out.println("Offset of subArray in targetArray is: " + offset);
	}

}
