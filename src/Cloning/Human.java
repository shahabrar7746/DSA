package Cloning;

public class Human implements Cloneable {

 int age;
 String name;
 String gender;
 Human(int age,String name,String gender){
	 this.age = age;
	 this.name = name;
	 this.gender = gender;
 }
 public Object clone() throws CloneNotSupportedException {
	 return super.clone();
 }
 
}
