package logicalmilestone3.array5;

public class MissingNoInSequence {

	public static void main(String[] args) {

		//0  1  2  3  4
		int a[] = {3, 4, 8, 10, 11};	//missing 5 6 7 9

		for(int i=0; i<a.length-1; i++) {

			//	a[0]=3
			int mis=a[i]+1;					 //3+1=4 4+1=5 5+1=6
			int index = i+1;	//target index 0+1=1 1+1=2 2+1=3

			while(mis < a[index]) {
				System.out.print(mis + " ");
				mis++;
			}

		}


	}


}
