package prj_laschen1;

public class LaschenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s1 = "T. Laschen";

int dist_left = 5;
int dist_right = 5;
int dist_up = 3;
int dist_down = 3;

String left_s = "";
String right_s = "";
String l2 = "";

		for(int i=0;i<dist_left;i++)
		{
			left_s = left_s + " ";
		}
		for(int i=0;i<dist_right;i++)
		{
			right_s = right_s + " ";
		}
		for(int i=0;i<s1.length();i++)
		{
			l2 = l2 + " ";
		}

String s2 = "|" + left_s + l2 + right_s + "|";
s1 = "|" + left_s + s1 + right_s + "|";
int l1 = s1.length();

		for(int i=0;i<l1;i++)
		{
			System.out.print("-");
		}
		System.out.println("");
		for(int i=0;i<dist_up;i++)
		{
			System.out.println(s2);
		}
		System.out.println(s1);
		for(int i=0;i<dist_down;i++)
		{
			System.out.println(s2);
		}
		
		for(int i=0;i<l1;i++)
		{
			System.out.print("-");
		}
		
	}
}
