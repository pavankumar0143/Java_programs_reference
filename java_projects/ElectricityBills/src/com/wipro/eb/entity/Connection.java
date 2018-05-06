package com.wipro.eb.entity;

public abstract class Connection {
	int previousReading,currentReading;
	float[]slabs;
	public Connection(int currentReading,int previousReading,float slabs[]){
		
	}
	public abstract int getPreviousReading();
	public abstract void setPreviousReading(int previousReading);
	public abstract int getCurrentReading();
	public abstract void setCurrentReading(int currentReading);
	public abstract float[] getSlabs();
	public abstract void setSlabs(float[] slabs);
	public abstract float computeBill();
	}

