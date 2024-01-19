
package hw_3;

/**
 *
 * @author Francisco Lovera
 */
public class patients 
{
    private String fName;
    private String mName;
    private String lName;
    
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone_number;
    
    private String eName;
    private String ePhone;
    
    //***********//
    //Constructor//
    //***********//
    
    public patients(String fName, String mName, String lName, String address, String city, String state, String zip, String phone_number, String eName, String ePhone)
    {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_number = phone_number;
        
        this.eName = eName;
        this.ePhone = ePhone;
    }
    //********//
    //Acessors//
    //********//
    public String getfName()
    {
        return fName;
    }
    
    public String getmName()
    {
        return mName;
    }
    
    public String getlName()
    {
        return lName;
    }
    
    public String getaddress()
    {
        return address;
    }
    
    public String getcity()
    {
        return city;
    }
    
    public String getstate()
    {
        return state;
    }
    
    public String getzip()
    {
        return zip;
    }
    
    public String getphone_number()
    {
        return phone_number;
    }
    
    public String geteName()
    {
        return eName;
    }
    
    public String getePhone()
    {
        return ePhone;
    }
    //********//
    //Mutators//
    //********//
    
    public void setfName(String fName)
    {
        this.fName = fName;
    }
    
    public void setmName(String mName)
    {
        this.mName = mName;
    }
    
    public void setlName(String lName)
    {
        this.lName = lName;
    }
    
    public void setaddress(String address)
    {
        this.address = address;
    }
    
    public void setcity(String city)
    {
        this.city = city;
    }
    
    public void setstate(String state)
    {
        this.state = state;
    }
    
    public void setzip(String zip)
    {
        this.zip = zip;
    }
    
    public void setphone_number(String phone_number)
    {
        this.phone_number = phone_number;
    }
    
    public void seteName(String eName)
    {
        this.eName = eName;
    }
    
    public void setePhone(String ePhone)
    {
        this.ePhone = ePhone;
    }
}
