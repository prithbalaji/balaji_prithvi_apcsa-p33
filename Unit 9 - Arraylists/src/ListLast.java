//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListLast
{
	public static boolean go(List<Integer> ray)
	{
		if (ray.size()==0)
			return false;
		int cow= ray.get(ray.size()-1);
		for (int i=0;i<ray.size()-1;i++) {
			
			if (ray.get(i)==cow)
			{
				return true;
			}
			
		}
		return false;
	}
}