package chapter8;

public class arrayMystery {

	
	public static void mystery(int[] a, int[] b) {
		
		    for (int i = 0; i < a.length; i++) {
		        a[i] += b[b.length - 1 - i];
		    }
		}
	}


