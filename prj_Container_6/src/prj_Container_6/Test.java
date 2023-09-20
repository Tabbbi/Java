package prj_Container_6;

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
