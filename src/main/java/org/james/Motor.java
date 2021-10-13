package org.james;

public abstract class Motor {
    private String motor;
    
    public abstract String presentamotor();
    public String getmotor(){
        return motor;
    }

    public void setmotor(String motor){
        this.motor=motor;
    }
}
