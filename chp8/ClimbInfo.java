package chp8;

public class ClimbInfo {
	private String peakName;
	private int climbTime;
	public ClimbInfo(String peakName, int climbTime) 
	{
		this.peakName=peakName;
		this.climbTime=climbTime;
	}
	public String getName() {
		return peakName;
	}
	public void setName(String peakName) {
		this.peakName = peakName;
	}
	public int getClimbTime() {
		return climbTime;
	}
	public void setClimbTime(int climbTime) {
		this.climbTime = climbTime;
	}
}
