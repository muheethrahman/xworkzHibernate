package com.xworkz.birdsApp.birdsEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="birds")
public class BirdEntity implements Serializable{

	@Id
	private int id;
	@Column(name="B_name")
	private String birdName;
	@Column(name="B_country")
	private String country;
	@Column(name="B_lspan")
	private int lifeSpan;
	@Column(name="B_canFly")
	private boolean canFly;
	@Column(name="B_color")
	private String color;
	@Column(name="B_swims")
	private boolean canSwims;
	@Column(name="B_adpot")
	private boolean canAdapt;
	@Column(name="B_weight")
	private int weight;
	@Column(name="B_seen")
	private String CanSeen;
	
	public BirdEntity(int id, String birdName, String country, int lifeSpan, boolean canFly, String color,
			boolean canSwims, boolean canAdapt, int weight, String canSeen) {
		super();
		this.id = id;
		this.birdName = birdName;
		this.country = country;
		this.lifeSpan = lifeSpan;
		this.canFly = canFly;
		this.color = color;
		this.canSwims = canSwims;
		this.canAdapt = canAdapt;
		this.weight = weight;
		CanSeen = canSeen;
	}
	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", birdName=" + birdName + ", country=" + country + ", lifeSpan=" + lifeSpan
				+ ", canFly=" + canFly + ", color=" + color + ", canSwims=" + canSwims + ", canAdapt=" + canAdapt
				+ ", weight=" + weight + ", CanSeen=" + CanSeen + "]";
	}
	
	
	
	
	
}
