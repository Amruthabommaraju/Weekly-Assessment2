package WeeklyAssignment2;

public class TesterController {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//employee 1
		Employee o = new Employee("Ammu","Software Engineer",22);
		HrManager o2 =new HrManager();
		o = o2.display(o);
		o2.process_Records();
		//employee 2
		Employee b = new Employee("Kiran","Data Engineer",24);
		b = o2.display(b);
		o2.process_Records();
		//employee 3
		Employee c = new Employee("Krishna","Full Stack Developer",26);
		c = o2.display(c);
		o2.process_Records();
		//employee 4
		Employee d = new Employee("Amrutha","software analyst",23);
		d = o2.display(d);
		o2.process_Records();
		//employee 5
		Employee e = new Employee("Amir","UI Developer",21);
		e = o2.display(e);
		o2.process_Records();
		
		}

}
