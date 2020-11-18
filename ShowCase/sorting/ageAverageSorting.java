package mySolveProblems.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ageAverageSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<Person> personList = new ArrayList<Person>();
		  int avgs = 0;
			    personList.add(new Person("John Smith", 10));
		        personList.add(new Person("Katherine Jones", 20));
		        personList.add(new Person("Rick Perry", 55));
		        personList.add(new Person("Johnny Walker", 80));
		        personList.add(new Person("Amy Andersen", 30));
		    
		        for(Person avg: personList)
		        	avgs = avgs += avg.getAge();
		        
		        System.out.println("maxAge= "+Collections.max(personList));
		        System.out.println("minAge= "+Collections.min(personList));
		        System.out.println("averageAge= "+avgs/5);
		        System.out.println("");
		        Collections.sort(personList);
		        for(Person sortList : personList) {	        		       
		        System.out.println(sortList);
		        }
	}
}


class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	public Person(String name, int age) {
	this.name = name;
	this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString() {
		return "Name "+name+ "  Age= "+age;
	}

	@Override
	public int compareTo(Person comparable) {
		 int compared = comparable.age;
		return this.age - compared;
	}
}

	

//OUTPUT
/*
* maxAge= Name Johnny Walker Age= 80 
* minAge= Name John Smith Age= 10
* averageAge= 39
* 
* Name John Smith Age= 10 
* Name Katherine Jones Age= 20 
* Name Amy Andersen Age= 30 
* Name Rick Perry Age= 55 
* Name Johnny Walker Age= 80
*/