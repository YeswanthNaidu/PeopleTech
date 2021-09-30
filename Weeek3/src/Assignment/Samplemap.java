package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Samplemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Member> mem=new HashMap<Integer, Member>();
		mem.put(234,new Member("naidu","naidu@gmail.com","999999999"));
		mem.put(656,new Member("yeswanth","yeswanth@gmail.com","98888889"));
		mem.put(234,new Member("chandu","chnadu@gmail.com","977777999"));
		mem.put(354,new Member("pandu","pandu@gmail.com","96666699"));
		System.out.println(mem);
	}

}


class Member{
	String name;
	String email;
	String mobile;
	public Member(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	
	  public String getName() { 
		  return name; 
		  }
	  public void setName(String name) {
	  this.name = name;
	  } 
	  public String getEmail() { 
		  return email; 
		  } 
	  public void setEmail(String email) { this.email = email; } public String getMobile() {
	  return mobile; } public void setMobile(String mobile) { this.mobile = mobile;
	  }
	 
	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", mobile=" + mobile + "]\n";
	}
	
	
}