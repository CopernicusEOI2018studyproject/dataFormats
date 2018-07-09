package org.notgroupb.formats;

public class HygonDataPoint extends BasicDataPoint {
	
	private float mnw;
	
	private float mhw;
	
	private float average;
	
	private float level1;
	
	private float level2;
	
	private float level3;
	
	public float getMnw() {
		return mnw;
	}

	public void setMnw(float mnw) {
		this.mnw = mnw;
	}

	public float getMhw() {
		return mhw;
	}

	public void setMhw(float mhw) {
		this.mhw = mhw;
	}

	public float getLevel1() {
		return level1;
	}

	public void setLevel1(float level1) {
		this.level1 = level1;
	}

	public float getLevel2() {
		return level2;
	}

	public void setLevel2(float level2) {
		this.level2 = level2;
	}

	public float getLevel3() {
		return level3;
	}

	public void setLevel3(float level3) {
		this.level3 = level3;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}
}
