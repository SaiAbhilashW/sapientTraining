package training.day2;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private double marks;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected double getMarks() {
		return marks;
	}
	protected void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(Student arg0) {
		
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.name);
	}
}
