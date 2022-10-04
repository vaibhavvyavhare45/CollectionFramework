package hashsets;

import java.util.HashMap;

public class HashMapDebugViewDemo3 {
	public static void main(String[] args) {
		
	
	HashMap hm=new HashMap();
		hm.put("vaibhav", 19);
		hm.put("mukund","pisal");
		hm.put("pranav", 125);
		hm.put("vishwajeet","vusn");
		hm.put("marish",160);
		
		Object[] set=hm.keySet().toArray();
		for(int i=0;i<set.length;i++) {
			int hascode=set[i].hashCode();
			System.out.println(set[i].hashCode());
			int index=hascode%15;
			System.out.println(index);
			
		}
		System.out.println(hm);
	
	
	}
}
