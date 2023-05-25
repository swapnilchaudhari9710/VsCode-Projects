public class Anticlockwise {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		
		int temp=a[0];
		int i;
		for(i=0;i<a.length-1;i++) {			
			a[i]=a[i+1];			
		}
		
		a[a.length-1]=temp;
		for(i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
			
		}
	}

}
