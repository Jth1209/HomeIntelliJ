package edu.du.sb1024.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Respondent {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RESPONDENT_ID")
	private int id;

	private int age;
	private String location;

//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}

}
