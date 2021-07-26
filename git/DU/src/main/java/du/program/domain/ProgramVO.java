package du.program.domain;

public class ProgramVO {
	private String idx;
	private String prog;
	private long member;
	private String meterials;
	private String location;
	private long maxDepth;
	private long expense;
	private long includeGif;
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getProg() {
		return prog;
	}
	public void setProg(String prog) {
		this.prog = prog;
	}
	public long getMember() {
		return member;
	}
	public void setMember(long member) {
		this.member = member;
	}
	public String getMeterials() {
		return meterials;
	}
	public void setMeterials(String meterials) {
		this.meterials = meterials;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getMaxDepth() {
		return maxDepth;
	}
	public void setMaxDepth(long maxDepth) {
		this.maxDepth = maxDepth;
	}
	public long getExpense() {
		return expense;
	}
	public void setExpense(long expense) {
		this.expense = expense;
	}
	public long getIncludeGif() {
		return includeGif;
	}
	public void setIncludeGif(long includeGif) {
		this.includeGif = includeGif;
	}
	
	
	
}