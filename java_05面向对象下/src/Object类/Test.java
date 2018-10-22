package Object类;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.toString());
		//Student s2 = new Student("zl",12,12);
		//System.out.println(s1.equals(s2));
	}
}
class Student {
	private String name;
	private int sid;
	private int age;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int sid, int age) {
		super();
		this.name = name;
		this.sid = sid;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", age=" + age + "]";
	}
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(!this.name.equals(s.name)) {
				return false;
			}
			if(this.sid!=s.sid) {
				return false;
			}
			if(this.age!=s.age) {
				return false;
			}
			return true;
			
		}
		return false;
	}
}
