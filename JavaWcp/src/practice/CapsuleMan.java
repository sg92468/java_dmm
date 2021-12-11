package practice;

public class CapsuleMan {
	public String name;
    public int age;

    public CapsuleMan(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
}
