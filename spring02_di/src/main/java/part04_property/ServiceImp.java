package part04_property;

import java.util.Random;

public class ServiceImp implements Service {
	private String name;
	private Random ran;
	public ServiceImp() {

	}
	public void setRan(Random ran) {
		this.ran = ran;
	}
	
	public Random getRan() {
		return ran;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void prn1() {
		System.out.printf("name:%s\n",name);
	}

	@Override
	public void prn2() {
		System.out.printf("ran: %.2f\n",ran.nextDouble());
	}

}
