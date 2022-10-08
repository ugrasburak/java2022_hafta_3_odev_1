
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(new Customer(),new TeacherCreditManager());
		customerManager.GiveCredit();
				
		/*
		CreditManager creditManager=new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setCity("İstanbul");
				
		
		CustomerManager customerManager=new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company=new Company();
		company.setTaxNumber("10000");
		company.setCompanyName("Arçelik");
		company.setId(100);
		
		CustomerManager customerManager2=new CustomerManager(new Person());
		
		Person person=new Person();
		person.setFirstName("Ahmet");
		person.setNationalIdentity("Ankara");
		
		Customer c1=new Customer();
		Customer c2=new Person();
		Customer c3=new Company();
		*/
		
	}

}