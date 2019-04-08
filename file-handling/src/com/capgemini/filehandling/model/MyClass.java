package com.capgemini.filehandling.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class MyClass implements Serializable  {

	private int customerId;
	private String customerName;
	private int customerAge;

	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyClass(int customerId, String customerName, int customerAge) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	

	public boolean serialization(String filePath, Object obj) throws IOException {

		FileOutputStream fileoutputStream = new FileOutputStream(filePath);
		ObjectOutputStream outputStream = new ObjectOutputStream(fileoutputStream);
		outputStream.writeObject(obj);
		outputStream.close();
		System.out.println(obj);
		System.out.println("Writing  object into file successfully!");

		return true;

	}

	public Object deSerialization(String filePath) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

		ArrayList<MyClass> t = (ArrayList<MyClass>) inputStream.readObject();
		inputStream.close();
		System.out.println(t);
		System.out.println("Reading object from file successfully!");
		return t;
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(customerId,customerName);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyClass [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ "]";
	}
	

}
