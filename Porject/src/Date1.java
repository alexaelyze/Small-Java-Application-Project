
public class Date1
{
    private String month;
    private int day;
    private int year;
    
    public Date1(String mn, int d, int y)
    {
        month=mn;
        day=d;
        year=y;
    }
    
    public String GetMonth()
    {
        return month;
    }
    public int GetDay()
    {
        return day;
    }
    public int GetYear()
    {
        return year;
    }
}