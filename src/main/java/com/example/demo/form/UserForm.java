package com.example.demo.form;

public class UserForm {

	/** 年齢 */
	private String age;

	/** サイトを知ったきっかけ */
	private String[] trigger;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String[] getTrigger() {
		return trigger;
	}

	public void setTrigger(String[] trigger) {
		this.trigger = trigger;
	}
}