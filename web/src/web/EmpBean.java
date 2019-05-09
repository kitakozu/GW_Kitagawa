package web;

public class EmpBean {

	private String name=null;
	private int age=0;

	public int getAge() {
		return age;
	}

	//カプセル化したageに引数として受け取った値を代入
	public void setAge(int age) {
		this.age=age;
	}

	public String getName() {
		return name;
	}

	//カプセル化したnameに引数として受け取った値を代入
	public void setName(String name) {
		this.name=name;
	}
}
