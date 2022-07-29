package com.kishan.Demo_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Alien_TBL")
public class Alien {

	@Id
	private int aid;
	
	public int getAid() {
		return aid;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", color=" + color + "]";
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	private AlienName name;
	public AlienName getName() {
		return name;
	}
	public void setName(AlienName name) {
		this.name = name;
	}

	private String color;
}
