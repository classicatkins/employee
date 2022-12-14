public class Employee implements Measurable 
{
	private String name;
	private String job;
	private int salary;

	//@param name/job/salary//
	public Employee(String name, int salary, String job) 
	{
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	//getter methods that returns name/job/salary//
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getJob() 
	{
		return job;
	}
	public void setJob(String job) 
	{
		this.job = job;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setsalary(int salary) 
	{
		this.salary = salary;
	}
	//where the override occurs//
	public double getMeasure() 
	{
		return salary;
	}

	//returns a String that lists a employees job and name//
	public String toString() 
	{
		return job + "; " + name;
	}
}