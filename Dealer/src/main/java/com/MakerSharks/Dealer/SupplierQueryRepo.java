package com.MakerSharks.Dealer;
import java.util.List;
public class SupplierQueryRepo {
    private String location;
    private String natureOfBusiness;
    private List<String> manufacturingProcess;
    
    public String getlocation()
    {
    	return location;
    }
    public void setLocation(String location)
    {
    	this.location=location;
    }
    public String getnatureOfBusiness()
    {
    	return natureOfBusiness;
    }
    public void setNatureOfBusiness(String natureOfBusiness)
    {
    	this.natureOfBusiness=natureOfBusiness;
    }
    public List<String> getmanufacturingProcess()
    {
    	return manufacturingProcess;
    }
    public void setManufacturingProcess(List<String> manufacturingProcess)
    {
    	this.manufacturingProcess=manufacturingProcess;
    }
}
