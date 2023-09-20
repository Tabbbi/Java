package application;

import application.Containers.Con10Foot;

public class Test {

	public static void main(String[] args) 
	{
		ManagementContainer mc = new ManagementContainer();
		mc.start();
		mc.addContainer(new Con10Foot());
		mc.removeContainer("Con20Foot", 1);
		
		mc.showList();
		
	}
}
