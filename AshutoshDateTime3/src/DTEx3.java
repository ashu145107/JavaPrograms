import java.time.LocalDate;
import java.time.Period;

public class DTEx3 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate dob=LocalDate.of(2021,06,20);
		Period pb=Period.between(today, dob);
		System.out.println(pb);
		System.out.println(pb.getDays());
		System.out.println(pb.getMonths());
		System.out.println(pb.getYears());
	}

}

