import java.time.LocalDate;
import java.time.YearMonth;

public class DTEx2 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		YearMonth ym=YearMonth.of(2021, 05);
		YearMonth ym1=YearMonth.now();
		if(ym.equals(ym1)){
			System.out.println("the card expired");
		}
			
		
	}

}
