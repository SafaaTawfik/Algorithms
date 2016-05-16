
public class Sorting {
	
	int[] A;
	int N;
	public Sorting(int[] a,int n) {
	this.A=a;
	this.N=n;
	}

	void selectionSort()
	{
		for (int i = 0; i < A.length-1; i++) {  //we need to do n-2 passes
			int iMin=i; //consider the current element as the minimum
			for (int j = i+1; j < A.length; j++)  //loop to the rest of the array to get the index of the real minimum element 
			{
				if(A[j]<A[iMin])  
					iMin=j; //update the index of the minimum element
			}
			//Swap 
			int temp=A[i];
			A[i]=A[iMin];
			A[iMin]=temp;
		}
	}

   void bubbleSort()
   {
	   for (int k = 0; k < A.length-1; k++) {
		boolean swapExist=false;
		for (int i = 0; i < A.length-k-1; i++) {
			if(A[i]>A[i+1])
			{
				int temp=A[i];
				A[i]=A[i+1];
				A[i+1]=temp;
		       swapExist=true;
			}
		}
		if(!swapExist) break;
	}
   }
}
