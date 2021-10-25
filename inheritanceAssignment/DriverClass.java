package inheritanceAssignment;

public class DriverClass {

	public static void main(String[] args) {
		
		HumanBeing hb1= new HumanBeing();
		HumanBeing hb2= new HumanBeing();
		Employee e1= new Employee();
		Employee e2= new Employee();
		
		Engineer en1= new Engineer();
		Engineer en2= new Engineer();
		
		System.out.println("\n-----------------------------");
		System.out.println("SINGLE LEVEL INHERITANCE");
		System.out.println("-----------------------------");
		
		hb1.setName("Shanti Samanta");
		hb2.setName("Joey Tribbiani");
		
		e1.setName("Chandler Bing");
		e1.setId(1011);
		e1.setSalary(12000);
		
		e2.setName("Monica Geller");
		e2.setId(1022);
		e2.setSalary(55000);
		
		System.out.println("We are Human Beings");
		System.out.println(hb1.getName());
		System.out.println(hb2.getName());
		
		System.out.println("\nWe are human beings and employees");
		System.out.println(e1.getName() + " | "+ e1.getId()+" | "+ e1.getSalary()+" | ");
		System.out.println(e2.getName() + " | "+ e2.getId()+" | "+ e2.getSalary()+" | ");
		
		System.out.println("\n\n-----------------------------");
		System.out.println("MULTILEVEL INERITANCE");
		System.out.println("-----------------------------");
		
		en1.setName("Rachel Greene");
		en1.setId(1088);
		en1.setSalary(45000);
		en1.setDesignation("Juior Engineer");
		
		en2.setName("Phoebe Buffay");
		en2.setId(1055);
		en2.setSalary(35000);
		en2.setDesignation("System admin");
		
		System.out.println("\nWe are human beings + Employee + Engineer");
		System.out.println(en1.getName() + " | "+ en1.getId()+" | "+ en1.getSalary()+" | "+ en1.getDesignation()+" | ");
		System.out.println(en2.getName() + " | "+ en2.getId()+" | "+ en2.getSalary()+" | "+ en2.getDesignation()+" | ");
	}

}
