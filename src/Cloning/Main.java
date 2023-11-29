package Cloning;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Human Abrar = new Human(20,"Abrar","M");
		Human son = (Human) Abrar.clone();
		System.out.println(son.equals(Abrar));
		// TODO Auto-generated method stub
}}