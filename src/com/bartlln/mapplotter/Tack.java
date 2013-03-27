package com.bartlln.mapplotter;


public class Tack {
		
	private float Longi;
	private float Latt;
		
	public Tack(float Longi, float Latt)
	{
		this.Longi = Longi;
		this.Latt = Latt;
	}
	
	
	public float getLong()
	{
		return Longi;
	}

	public float getLatt()
	{
		return Latt;
	}

}
