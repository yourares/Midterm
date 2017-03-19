package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {	
	static ArrayList<Course> CourseList = new ArrayList<Course>();
	static Course Course1;
	static Course Course2;
	static Course Course3;
	
	static ArrayList<Semester> SemesterList = new ArrayList<Semester>();
	static Semester Fall;
	static Semester Spring;
	
	static ArrayList<Section> SectionList = new ArrayList<Section>();
	static Section Section1Course1Fall;
	static Section Section2Course1Spring;
	static Section Section1Course2Fall;
	static Section Section2Course2Spring;
	static Section Section1Course3Fall;
	static Section Section2Course3Spring;
	
	static ArrayList<Student> StudentList = new ArrayList<Student>();
	static Student Student1;
	static Student Student2;
	static Student Student3;
	static Student Student4;
	static Student Student5;
	static Student Student6;
	static Student Student7;
	static Student Student8;
	static Student Student9;
	static Student Student10;
	
	static ArrayList<Enrollment> EnrollmentList = new ArrayList<Enrollment>();
	

	@BeforeClass
	public static void setup() throws PersonException {
		Course1 = new Course("BUSINESS100", 3, eMajor.BUSINESS);
		Course2 = new Course("COMPSI101",6, eMajor.COMPSI);
		Course3 = new Course("CHEM103", 12, eMajor.CHEM);
		CourseList.add(Course1);
		CourseList.add(Course2);
		CourseList.add(Course3);
		
		Fall = new Semester(new Date(),new Date());
		Spring = new Semester(new Date(),new Date());
		SemesterList.add(Fall);
		SemesterList.add(Spring);
		
		Section1Course1Fall = new Section(Course1.getCourseID(), Fall.getSemesterID(), 110);
		Section2Course1Spring = new Section(Course1.getCourseID(), Spring.getSemesterID(), 220);
		Section1Course2Fall = new Section(Course2.getCourseID(), Fall.getSemesterID(), 330);
		Section2Course2Spring = new Section(Course2.getCourseID(), Spring.getSemesterID(), 550);
		Section1Course3Fall = new Section(Course3.getCourseID(), Fall.getSemesterID(), 880);
		Section2Course3Spring = new Section(Course3.getCourseID(), Spring.getSemesterID(), 990);
		SectionList.add(Section1Course1Fall);
		SectionList.add(Section2Course1Spring);
		SectionList.add(Section1Course2Fall);
		SectionList.add(Section2Course2Spring);
		SectionList.add(Section1Course3Fall);
		SectionList.add(Section2Course3Spring);
		
		Student1 = new Student("Ann1", "Li1", "L1", new Date(), "BUSINESS", "address1", "(302)-181-5699", "Ann1@udel.edu");
		Student2 = new Student("Ann2", "Li2", "L2", new Date(), "BUSINESS", "address2", "(302)-181-5699", "Ann2@udel.edu");
		Student3 = new Student("Ann3", "Li3", "L3", new Date(), "COMPSI", "address3", "(302)-243-1595", "Ann3@udel.edu");
		Student4 = new Student("Ann4", "Li4", "L4", new Date(), "COMPSI", "address4", "(302)-243-1595", "Ann4@udel.edu");
		Student5 = new Student("Ann5", "Li5", "L5", new Date(), "CHEM", "address5", "(302)-114-6503", "Ann5@udel.edu");
		Student6 = new Student("Ann6", "Li6", "L6", new Date(), "CHEM", "address6", "(302)-114-6503", "Ann6@udel.edu");
		Student7 = new Student("Ann7", "Li7", "L7", new Date(), "PHYSICS", "address7", "(302)-585-7964", "Ann7@udel.edu");
		Student8 = new Student("Ann8", "Li8", "L8", new Date(), "PHYSICS", "address8", "(302)-585-7964", "Ann8@udel.edul");
		Student9 = new Student("Ann9", "Li9", "L9", new Date(), "NURSING", "address9", "(302)-816-5060", "Ann9@udel.edu");
		Student10 = new Student("Ann10", "Li10", "L10", new Date(), "NURSING", "address10", "(302)-816-5060", "Ann10@udel.edu");
		StudentList.add(Student1);
		StudentList.add(Student2);
		StudentList.add(Student3);
		StudentList.add(Student4);
		StudentList.add(Student5);
		StudentList.add(Student6);
		StudentList.add(Student7);
		StudentList.add(Student8);
		StudentList.add(Student9);
		StudentList.add(Student10);}
		

	@Test
	public void Gradetest() {
		EnrollmentList.get(0).setGrade(0.0);// 0 points
		EnrollmentList.get(1).setGrade(1.0);// 2 points
		EnrollmentList.get(2).setGrade(1.5);// 4 points
		EnrollmentList.get(3).setGrade(2.0);// 6 points
		EnrollmentList.get(4).setGrade(2.5);// 8 points
		EnrollmentList.get(5).setGrade(3.0);// 10 points 
		EnrollmentList.get(6).setGrade(3.5);// 14 points
		EnrollmentList.get(7).setGrade(4.0);// 16 points
		EnrollmentList.get(8).setGrade(3.0);// 10 points
		EnrollmentList.get(9).setGrade(4.0);// 16 points
		
		
	
}

}