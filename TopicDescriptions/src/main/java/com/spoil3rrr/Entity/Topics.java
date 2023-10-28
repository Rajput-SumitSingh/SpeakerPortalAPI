package com.spoil3rrr.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "speaker_topics")
public class Topics {
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int count ;
	@Id
	private int id ;
	private String title;
	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topics(int count, int id, String title) {
		super();
		this.count = count;
		this.id = id;
		this.title = title;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Topics [count=" + count + ", id=" + id + ", title=" + title + "]";
	} 
	
	

}
