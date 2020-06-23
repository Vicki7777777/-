package JavaOOP;

public class Student {
    private String name;
    private int age;
    private String sex;
    private int id;
    
    public Student(){
    	
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(17);
        student.setSex("female");
        student.setId(1234568);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSex());
        System.out.println(student.getId());
    }
}
