package com.capgemini.collection.model;

import java.util.Objects;

public class School {

	private String name;
	private String city;
	private String schoolDistrict;
	private double greatSchoolRanking;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String name, String city, String schoolDistrict, double greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public double getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(double greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, city, schoolDistrict);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof School))
			return false;
		if (this == obj)
			return true;
		School school = (School) obj;
		if (this.name.equals(school.name) && this.city.equals(school.city)
				&& this.schoolDistrict.equals(school.schoolDistrict))
			return true;
		else
			return false;

	}
}
