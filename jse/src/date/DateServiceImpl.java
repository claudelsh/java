package date;

public class DateServiceImpl implements DateService{

	@Override
	public String getEndDayOfMonth(int year, int month) {
		// TODO Auto-generated method stub
		String result = "";
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			result = "31";
			break;
		case 2:
			/*result = "28";
			if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400) == 0)) {
				result = "29";
			}*/
			result = ((year % 4 == 0) && ((year % 100 != 0) || (year % 400) == 0)) ? "29" : "28";
			break;
		case 4:case 6:case 9:case 11:
			result = "30";
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		return result;
	}

}
