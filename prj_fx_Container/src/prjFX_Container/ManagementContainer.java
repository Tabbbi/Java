package prjFX_Container;

import java.util.ArrayList;
//import java.util.Collections;

import prjFX_Container.Containers.Con10Foot;
import prjFX_Container.Containers.Con20Foot;
import prjFX_Container.Containers.Con40Foot;
import prjFX_Container.Containers.Container;

public class ManagementContainer
{
	private ArrayList<Container> ContainerStock = new ArrayList<Container>();

	public ArrayList<Container> start()
	{
		return initList();
	}

	public ArrayList<Container> initList()
	{
		for (int i = 0; i < 2; i++)
		{
			ContainerStock.add(new Con10Foot());
			ContainerStock.add(new Con20Foot());
			ContainerStock.add(new Con40Foot());
		}
		return ContainerStock;
	}
	
	public void showList()
	{
		int c10 = 0;
		int c20 = 0;
		int c20High = 0;
		int c40 = 0;
		int c40High = 0;
		for (int i = 0; i < ContainerStock.size(); i++)
		{
			switch(ContainerStock.get(i).getClass().getSimpleName())
			{
			case "Con10Foot":
				c10++;
				break;
			case "Con20Foot":
				c20++;
				break;
			case "Con20High":
				c20High++;
				break;
			case "Con40Foot":
				c40++;
				break;
			case "Con40HIgh":
				c40High++;
				break;
			}
		}
		System.out.println(c10 + " Ten Foot Container");
		System.out.println(c20 + " Twenty Foot Container");
		System.out.println(c20High + " Twenty Foot Cubed Container");
		System.out.println(c40 + " Fourty Foot Container");
		System.out.println(c40High + " Fourty Foot Cubed Container");
	}

	public void addContainer(Container pContainer)
	{
		ContainerStock.add(pContainer);
	}
	
	public void removeContainer(String pContainer, int pAmount)
	{
		int c = 1;
		for (int i = 0; i < ContainerStock.size(); i++) 
		{
			if ((ContainerStock.get(i).getClass().getSimpleName().equals(pContainer)) && (c <= pAmount))
			{
				ContainerStock.remove(i);
				c++;
			}
		}
	}
}
