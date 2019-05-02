package service;

import java.util.List;

import bean.Person;
import dao.ClearentDAO;

public class ClearentServiceImpl {
	
	private static ClearentDAO dao;
	
	public static List<Person> addTestCase1data() {
		dao = new ClearentDAO();
		return dao.addTestCase1data();
	}
	
	public static List<Person> addTestCase2data() {
		dao = new ClearentDAO();
		return dao.addTestCase2data();
	}
	
	public static List<Person> addTestCase3data() {
		dao = new ClearentDAO();
		return dao.addTestCase2data();
	}
	
}
