package logicalmilestone3.array5;

public class SmallestNo {

	public static void main(String[] args) {

		int a[]={3,5,4,7,8,2};
		
		int smallest = a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(smallest > a[i])
				smallest = a[i];
		}
		System.out.println(smallest);
		
	}

}
