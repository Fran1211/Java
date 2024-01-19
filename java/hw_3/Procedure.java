
package hw_3;

/**
 *
 * @author Francisco Lovera
 */
public class Procedure 
{
    private String procedure_name;
    private String procedure_date;
    private String practitioner;
    private Double charge;
    
    //***********//
    //Constructor//
    //***********//
    
    public Procedure(String procedure_name, String procedure_date, String practitioner, Double charge)
    {
        this.procedure_name = procedure_name;
        this.procedure_date = procedure_date;
        this.practitioner = practitioner;
        this.charge = charge;
    }
    
    //********//
    //Accesors//
    //********//
    
    public String getprocedure_name()
    {
        return procedure_name;
    }
    
    public String getprocedure_date()
    {
        return procedure_date;
    }
    
    public String getpractitioner()
    {
        return practitioner;
    }
    
    public Double getcharge()
    {
        return charge;
    }
    
    //********//
    //Mutators//
    //********//
    
    public void setprocedure_name(String procedure_name)
    {
        this.procedure_name = procedure_name;
    }
    
    public void setprocedure_date(String procedure_date)
    {
        this.procedure_date = procedure_date;
    }
    
    public void setpractitioner(String practitioner)
    {
        this.practitioner = practitioner;
    }
    
    public void setcharge(Double charge)
    {
        this.charge = charge;
    }
}
