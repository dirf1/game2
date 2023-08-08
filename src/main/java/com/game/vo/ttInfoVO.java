package com.game.vo;

public class ttInfoVO {

	private int ttNum;
	private int ttName;
	private int credat;
	/**
	 * @return the ttNum
	 */
	public int getTtNum() {
		return ttNum;
	}
	/**
	 * @param ttNum the ttNum to set
	 */
	public void setTtNum(int ttNum) {
		this.ttNum = ttNum;
	}
	/**
	 * @return the ttName
	 */
	public int getTtName() {
		return ttName;
	}
	/**
	 * @param ttName the ttName to set
	 */
	public void setTtName(int ttName) {
		this.ttName = ttName;
	}
	/**
	 * @return the credat
	 */
	public int getCredat() {
		return credat;
	}
	/**
	 * @param credat the credat to set
	 */
	public void setCredat(int credat) {
		this.credat = credat;
	}
	@Override
	public String toString() {
		return "ttInfoVO [ttNum=" + ttNum + ", ttName=" + ttName + ", credat=" + credat + "]";
	}
}
