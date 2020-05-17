package com.athiya.hybernatemapping.HybernateMappingProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

@Id
private int id;
private String studentname;
private int halltiktno;
@ManyToMany(mappedBy = "student")
private List<Laptop> laptop=new ArrayList<Laptop>();


public List<Laptop> getLaptop() {
	return laptop;
}
public void setLaptop(List<Laptop> laptop) {
	this.laptop = laptop;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getHalltiktno() {
	return halltiktno;
}
public void setHalltiktno(int halltiktno) {
	this.halltiktno = halltiktno;
}


}
