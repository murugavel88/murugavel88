package TestNg.org;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = "model",priority = 4,timeOut = 2000,invocationCount = 4)
	private void std_id() { 
		System.out.println("student id");
	}

	@Test(groups = "model",priority = 2,timeOut = 2000)
	private void std_name() {
		System.out.println("student name");
	}

	@Test(groups = "employee",priority = 3)
	private void emp_id() {
		System.out.println("employe id");

	}

	@Test(groups = "emoyee",priority = 5)
	private void emp_name() {
		System.out.println("emple name");

	}

	@Test(groups = "company",priority = 6)
	private void company_id() {
		System.out.println("companey  id");

	}

	@Test(groups = "compny",priority = 1,expectedExceptions = Exception.class)
	private void company_name() {
		System.out.println(10/0);
		

	}
}
