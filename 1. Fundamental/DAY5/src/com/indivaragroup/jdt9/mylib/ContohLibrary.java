package com.indivaragroup.jdt9.mylib;
import com.indivaragroup.jdt9.io.*;

public class ContohLibrary
{
	private void khususInternal()
	{
		System.out.println("Function khusus internal");
	}

	protected void khususTurunan()
	{
		System.out.println("Function khusus Turunan");
	}

	void khususPackage()
	{
		System.out.println("Function khusus satu package");
	}

	public void callMe()
	{
		System.out.println("Call Me....");
		IOLib i=new IOLib();
		i.io();
		khususInternal();
	}
}
