package org.xlsxtolua.pojo;

import java.util.ArrayList;
import java.util.HashMap;

public class TableDataDropBasePojo {
	private Integer id;
	private String reward;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public TableDataDropBasePojo() {
	}

	public TableDataDropBasePojo(Integer id, String reward) {
		this.id = id;
		this.reward = reward;
	}
}
