package com.hcl.day3;

public class Perfect
{
public void show(int n)
{
	int k=0;

	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			k=k+i;
		}
	}
	if(k==n)
		{	
			System.out.println(n+ "is Perfect number ");
		}
		else
		{
			System.out.println(n+ "is Not perfect ");
		}
}
public static void main(String[] args)
{
	int n=28;
	new Perfect().show(n);
}
}
