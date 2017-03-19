package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


import org.hibernate.engine.spi.Status;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static ArrayList<Staff> StaffList = new ArrayList<Staff>();
	static Staff Staff1;
	static Staff Staff2;
	static Staff Staff3;
	static Staff Staff4;
	static Staff Staff5;


	@BeforeClass
	public static void setup() {
		Staff1 = new Staff("Tim", "Yu", "Tian", new Date(), "street 1", "(302)-181-5699", "231 Road", "Tim@udel.edu", 1,100000.0, new Date(), eTitle.Sun);
		Staff2 = new Staff("Lily", "Ann", "Yan", new Date(), "street 2", "(302)-243-1595", "231 Road", "Lily@udel.edu", 2, 120000.0, new Date(), eTitle.Jun);
		Staff3 = new Staff("Felix", "Tian", "Yun", new Date(), "street 3", "(302)-114-6503", "231 Road", "Felix@udel.edu", 3, 140000.0,new Date(), eTitle.Ads);
		Staff4 = new Staff("Yun", "Lily", "Ann", new Date(), "street 4", "(302)-585-7964", "231 Road", "Yun@udel.edu", 4, 160000.0, new Date(), eTitle.Jun);
		Staff5 = new Staff("Ann", "Tim", "Lily", new Date(), "street 5", "3028165060", "231 Road", "Ann@udel.edu", 6, 180000.0, new Date(), eTitle.Ads);
		StaffList.add(Staff1);
		StaffList.add(Staff2);
		StaffList.add(Staff3);
		StaffList.add(Staff4);
		StaffList.add(Staff5);
	}
	

	@Test
	public void SalaryTest() {
		double total = 0.0;
		for (Staff s: StaffList){
			total += s.getSalary();
		}
		double average = total/StaffList.size();
		assertEquals(average,140000);
	}	
	
	@Test(expected = PersonException.class)
	public void DOBandPhoneTest() throws PersonException{
		Calendar newCalendar =  Calendar.getInstance();
		newCalendar.set(Calendar.YEAR, 1900);
		newCalendar.set(Calendar.MONTH,2);
		newCalendar.set(Calendar.DATE,22);
		Date newDate = newCalendar.getTime();
		try {
			Staff5.setDOB(newDate);
		} catch (Exception e) {
			System.out.println("invalid DOB and phone number");
			e.printStackTrace();
		}
	}

}
