package co.ceiba.domain;

public class Person {
	private String name;
	private String lastName;
	
	public Person(String name,String lastName){
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName(){
		return name;
	}
	
	public String getlastName(){
		return lastName;
	}
}
