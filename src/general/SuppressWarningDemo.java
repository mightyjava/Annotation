package general;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List addInList() {
		List list = new ArrayList();
		list.add("aaa");
		list.add(123);
		list.add(12.05);
		return list;
	}
}
