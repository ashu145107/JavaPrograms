
import java.time.LocalDate;

public class DTEx {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate dob=LocalDate.of(2021, 05, 14);
		if(today.equals(dob))
		{
			System.out.println("Today is your birthday");
		}
	}
}