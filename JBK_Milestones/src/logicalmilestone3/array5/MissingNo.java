package logicalmilestone3.array5;

public class MissingNo {
	
	public static void main(String[] args) {
					
				 //0  1  2  3  4
		int a[] = {3, 4, 6, 7, 9};	//missing 5 8
		
		for(int i=0; i<a.length-1; i++) {
			
			//	a[0]=3
			int mis=a[i]+1;					  //3+1=4 4+1=5
			int index = i+1;	//target index 0+1=1 1+1=2
			
			if(mis != a[index]) {
				System.out.println(mis);
			}
			
		}
		
		
	}
	

}
