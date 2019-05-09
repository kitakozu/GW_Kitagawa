package JavaBeans;

import java.io.Serializable;

public class SampleBean implements Serializable {

	//カプセル化
	private int salary = 0;

	//salaryのgetter
	public int getSalary() {
		return salary;
	}

	//salaryのsetter
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		//SampleBeanをインスタンス化して
		SampleBean bean = new SampleBean();
		//setterを使って値を設定
		bean.setSalary(100);

		//getterで値の呼び出し
		System.out.println("給料"+bean.getSalary()+"円");

	}

}
