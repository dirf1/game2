package com.game.vo;

public class BoardInfoVO {

	private int biNum;
	private String biTitle;
	private String biContent;
	private int uiNum;
	private String credat;
	private String cretim;
	private String lmodat;
	private String lmotim;
	private String active;
	private String searchStr;
	private String searchType;
	private String uiName;

	public String getsearchStr() {
		return searchStr;
	}

	public void setsearchStr(String searchStr) {
		this.searchStr = searchStr;
	}

	public String getsearchType() {
		return searchType;
	}

	public void setsearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getuiName() {
		return uiName;
	}

	public void setuiName(String uiName) {
		this.uiName = uiName;
	}

	public int getBiNum() {
		return biNum;
	}

	public void setBiNum(int biNum) {
		this.biNum = biNum;
	}

	public String getBiTitle() {
		return biTitle;
	}

	public void setBiTitle(String biTitle) {
		this.biTitle = biTitle;
	}

	public String getBiContent() {
		return biContent;
	}

	public void setBiContent(String biContent) {
		this.biContent = biContent;
	}

	public int getUiNum() {
		return uiNum;
	}

	public void setUiNum(int uiNum) {
		this.uiNum = uiNum;
	}

	public String getCredat() {
		return credat;
	}

	public void setCredat(String credat) {
		this.credat = credat;
	}

	public String getCretim() {
		return cretim;
	}

	public void setCretim(String cretim) {
		this.cretim = cretim;
	}

	public String getLmodat() {
		return lmodat;
	}

	public void setLmodat(String lmodat) {
		this.lmodat = lmodat;
	}

	public String getLmotim() {
		return lmotim;
	}

	public void setLmotim(String lmotim) {
		this.lmotim = lmotim;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "BoardInfoVO [biNum=" + biNum + ", biTitle=" + biTitle + ", biContent=" + biContent + ", uiNum=" + uiNum
				+ ", credat=" + credat + ", cretim=" + cretim + ", lmodat=" + lmodat + ", lmotim=" + lmotim
				+ ", active=" + active + ", searchStr=" + searchStr + ", searchType=" + searchType + ", uiName="
				+ uiName + "]";
	}
}
