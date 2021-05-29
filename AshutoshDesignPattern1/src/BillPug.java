
public class BillPug {
	public static void main(String[] args) {
		CricketTeamm c1=CricketTeamm.getInstance();
		System.out.println("Trying to make a captain for our team");
		c1.setCaptain("Virat");
		System.out.println("Trying to make another captain for our team");
		CricketTeamm c2=CricketTeamm.getInstance();
		c2.setCaptain("Rohit");
		if(c1.equals(c2)) {
			System.out.println("c1 and c2 are same instance");
		}
	}

}
