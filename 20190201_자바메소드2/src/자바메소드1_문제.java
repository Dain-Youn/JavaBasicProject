// 5���� ������ �����߻� ==> max,min
public class �ڹٸ޼ҵ�1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int [5];
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		
		//�ִ밪
		int max=max(arr);
		
		int min=min(arr);
		
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		System.out.println();
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
	static int max(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<5;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	static int min(int [] arr)
	{
		int min=arr[0];
		for(int i=0;i<5;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
}
