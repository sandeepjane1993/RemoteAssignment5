import java.util.Arrays;

public class ArraySumTarget {

	public static void main(String[] args) {
		int[] array = {1,3,6,10};
		ArraySumTarget obj =new ArraySumTarget();
		System.out.println(Arrays.toString(obj.arraySum(array,11)));
	}
	public int[] arraySum(int[] array,int target)
	{
		int[] result = new int[2];
		for(int i =0;i<array.length;i++)
		{
			
			for(int j=i+1;j<array.length;j++)
			{
			if(array[i]+array[j]==target)
			{
				result[0]=array[i];
				result[1]= array[j];
			}
			}
		}
		return result;
	}

}
