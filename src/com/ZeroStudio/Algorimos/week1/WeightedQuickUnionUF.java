package com.ZeroStudio.Algorimos.week1;

public class WeightedQuickUnionUF {
	private int[] id, sz;
	private int count;
	
	public WeightedQuickUnionUF(int N){
		id = new int[N];
		sz = new int[N];
		for(int i=0;i<id.length;i++) id[i]=i;
		for(int i=0;i<id.length;i++) sz[i]=1;
	}
	
	private int root(int i){
		while(i != id[i]){
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q){
		return root(p) == root(q);
	}
	
	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		if(i == j) return;
		if(sz[i] < sz[j]) { id[i] =j; sz[j] += sz[i];}
		else			  { id[j] =i; sz[i] += sz[j];}
	}
	
	//binary search
	public static int binarySearch(int[] a, int key){
		int lo = 0, hi = a.length;
		while(lo<=hi){
			int mid = lo + (hi - lo) / 2;
			if		(key < a[mid]) hi = mid - 1;
			else if	(key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}
}
