package prj_Container_Management;

import java.util.ArrayList;

public class Management {
	private ArrayList<Container> containerManagement = new ArrayList<Container>();

	public void addContainer(String pType, int pAmount) {
		for (int i = 0; i < pAmount; i++) {
			Container newContainer = null;
			if (pType == "Ten-Foot") {
				newContainer = new TenFootContainer();
			}
			containerManagement.add(newContainer);
		}
	}

}
