package com.ZeroStudio.Algorimos.week1;

public class ThreeSum {
	public static int count(int[] a){
		int N = a.length;
		int count = 0;
		for(int i=0; i<N; i++)
			for(int j=i+1; j<N; j++)
				for(int k=j+1; k<N; k++)
					if(a[i] + a[j] + a[k] == 0)
						count++;
		return count;
	}
	
	public static void main(String[] args) {
//		int[] a = In.readInt(args[0]);
//		Stopwatch stopwatch = new Stopwatch();
//		StdOut.println(count(a));
//		double time = stopwatch.elapsedTime();
		int[] values = {10,20,-30,40,-40,0};
        int valuesCount = 0;
        for (String arg : args) {
            int value = Integer.valueOf(arg);
            values[valuesCount++] = value;
        }
        System.out.println(String.format("count: %d", count(values)));
	}
}
