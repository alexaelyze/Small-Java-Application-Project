import java.util.Date;
import java.util.Date;

public class Product {
    private String name;
    private String code;
    public Date1 manDate;

    public Product(String nm, String cd, Date1 dt) {
        name = nm;
        code = cd;
        manDate = dt;
    }

    public void SetDate(Date1 dt) {
        manDate = dt;
    }

    public void SetName(String nm) {
        name = nm;
    }

    public void SetCode(String cd) {
        code = cd;
    }

    public String GetName() {
        return name;
    }

    public String GetCode() {
        return code;
    }

    public Date1 GetDate() {
        return manDate;
    }

public boolean CheckDate() {
    Date d = new Date();
    int currentYear = d.getYear() + 1900;
    
    if (GetName().equals("Corned Beef") && (currentYear - manDate.GetYear()) <= 5) {
        return true; 
    } 
    
    else return (currentYear - manDate.GetYear()) <= 2;
   }
}