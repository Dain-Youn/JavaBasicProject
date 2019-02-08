// 5개의 정수를 난수발생 ==> max,min
//Hello GitHub
public class 자바메소드1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int [5];
		for(int i=0;i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		
		//최대값
		int max=arr[0];
		for(int i=0;i<5;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		//최소값
		int min=arr[0];
		for(int i=0;i<5;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		System.out.println();
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
