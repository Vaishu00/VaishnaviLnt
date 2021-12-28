package lti;

public class Student {
private int roolnumber;
private String name;
public int getRoolnumber() {
	return roolnumber;
}
public void setRoolnumber(int roolnumber) {
	this.roolnumber = roolnumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student(int roolnumber, String name) {
	
	this.roolnumber = roolnumber;
	this.name = name;
}


}
