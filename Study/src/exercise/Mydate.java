package exercise;
import java.util.*;
public class Mydate {
	private int day;
	private int month;
	private int year;
	private boolean isValid=true;
	
	public Mydate(int day,int month,int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	private int getDay() {
		return day;
	}

	private void setDay(int day) {
		switch(month) {
		case 1,3,5,7,8,10,12:
			if(day<0||day>31) {
				isValid=false;
			}else {
				this.day = day;
			}
		break;
		
		case 4,6,9,11:{
			if(day<0||day>30) {
				isValid=false;
			}else
			{
				this.day=day;
			}
		}
		case 2:	
			if((year%4==0&&year%100!=0)||year%400==0) {
				if(day<0||day>29) {
					isValid=false;
				}
				else {
					this.day=day;
				}
			}else {
				if(day<0||day>28) {
					isValid=false;
				}
				else {
					this.day=day;
				}
			}
			break;
		default:
				isValid=false;
		}
	}

	private int getMonth() {
		return month;
	}

	private void setMonth(int month) {
		if(month<0||month>12) {
			isValid=false;
		}else {
		this.month = month;
		}
	}	

	private int getYear() {
		return year;
	}

	private void setYear(int year) {
		if(year>Calendar.getInstance().get(Calendar.YEAR)) {
			isValid=false;
		}
		else {
		this.year = year;
		}
	}
	public String isValid() {
		if(isValid) {
			return "유효한 날짜입니다.";
		}
		else {
			return "유효하지 않은 날짜입니다.";
		}
	}
	
	

}
