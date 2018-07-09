package org.notgroupb.formats;

public final class PegelOnlineDataPoint extends BasicDataPoint {
	
	private double mhw;
	
	private double hhw;
	
	private double mw;
	
	private double mnw;
	
	private double cwl;
	
	public double getCwl() {
		return cwl;
	}

	public void setCwl(double cwl) {
		this.cwl = cwl;
	}

	public double getMnw() {
		return mnw;
	}

	public void setMnw(double mnw) {
		this.mnw = mnw;
	}

	public double getMw() {
		return mw;
	}

	public void setMw(double mw) {
		this.mw = mw;
	}

	public double getHhw() {
		return hhw;
	}

	public void setHhw(double hhw) {
		this.hhw = hhw;
	}

	public double getMhw() {
		return mhw;
	}

	public void setMhw(double mhw) {
		this.mhw = mhw;
	}
}