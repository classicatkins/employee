public class Driver 
{
    //method that finds the average measure of an array of Measurables//
	public static double average(Measurable[] objects) 
    {
		int sum = 0, x = objects.length;
            for(int i = 0; i < x; i++)
        {
            sum += objects[i].getMeasure();
		}
		return sum / x;
	}

	//method that finds/returns the object with largest measure from the array of Measurable//
	static Measurable largest(Measurable[] objects) 
    {
		Measurable max = null;
		//for loop that goes through each object in Measurable array//
		for (Measurable x : objects) 
        {
			//if max is null or if x is larger then the max then x is updated to be the max then the max is returned//
			if (max == null || x.getMeasure() > max.getMeasure()) 
            {
				max = x;
			}
		}
		return max;
	}
	public static void main(String[] args) 
    {
		//array of Measurable is created/filled with employee information//
		Measurable n[] = new Measurable[4];
		n[0] = new Employee("Melissa Atkins", 100000, "CEO");
		n[1] = new Employee("Harold James", 75000, "Programmer");
		n[2] = new Employee("Diane Jones", 85000, "HR Executive");
		n[3] = new Employee("Arabella Martychenko", 95000, "Manager");

		//prints the average salary of all the employees//
		System.out.println("The average salary of all the employees: " + average(n));
		//prints the largest salary out off all the employees//
		System.out.println("The employee with the largest salary: " + largest(n));
	}
}
