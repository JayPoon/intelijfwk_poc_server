package com.clt.weixin.message.menu;
/**
 * click类型按钮
 * 
 *
 */
public class ClickButton extends Button {
	private String type;

	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
