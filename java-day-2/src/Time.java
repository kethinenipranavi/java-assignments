public class Time {
	private int hours;
	private int minutes;
	public void setTime(int hours,int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
	}
	public void displayTime()
	{
		System.out.println(hours+ "Hours" +minutes+ "Minutes");
	}
	public Time sumOfTimes(Time number)
	{
		Time time3 = new Time();
		time3.hours=this.hours+number.hours;
		time3.minutes=this.minutes+number.minutes;
		if(time3.minutes >=60)
		{
			time3.minutes = time3.minutes-60;
			time3.hours = time3.hours+1;
		}
		return time3;
	}
}	