package array;

public class minimum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a[]=new int[] {34,7,23,32,5,6,29};
	    int min =a[0];
	    for(int x=0;x<a.length;x++)
	    {
	    	if(a[x]<min)
	    	{
	    		min=a[x];
	    	}
	    }
	    System.out.println(min);
	}

}
