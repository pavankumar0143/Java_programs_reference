package com.wipro.eb.entity;
import java.text.DecimalFormat;
public class Domestic extends Connection{
	private int previousReading,currentReading;
	private float[]slabs;
	public Domestic(int currentReading, int previousReading, float[] slabs) {
		super(currentReading,previousReading,slabs);
		this.currentReading=currentReading;
		this.previousReading=previousReading;
		this.slabs=slabs;
	}
	public int getPreviousReading() {
		return previousReading;
	}

	public void setPreviousReading(int previousReading) {
		this.previousReading = previousReading;
	}

	public int getCurrentReading() {
		return currentReading;
	}

	public void setCurrentReading(int currentReading) {
		this.currentReading = currentReading;
	}

	public float[] getSlabs() {
		return slabs;
	}

	public void setSlabs(float[] slabs) {
		this.slabs = slabs;
	}
	
	public float computeBill() {
		int g=currentReading-previousReading;
		float k=0;
		if(g<50)
		 { 	
		      k=g*slabs[0];
		  }
		else if(g>50 && g<=100)
		 {
			k=(50*slabs[0])+((g-50)*slabs[1]);
		 }
		else if(g>100)
		{
		    k=(50*slabs[0])+(100*slabs[1])+((g-100)*slabs[2]);
		}
		DecimalFormat df=new DecimalFormat("###.##");
		return Float.valueOf(df.format((double)k));
	}

}
