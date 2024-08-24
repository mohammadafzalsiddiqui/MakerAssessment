package com.MakerSharks.Dealer;
import java.util.*;
public class Supplier {
    private Long supplierId;
    private String companyName;
    private String website;
    private String location;
    private String natureOfBusiness;
    private List<String> manufacturingProcesses;
    public Supplier(Long supplierId, String companyName, String website, String location, 
                    String natureOfBusiness, List<String> manufacturingProcesses) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.website = website;
        this.location = location;
        this.natureOfBusiness = natureOfBusiness;
        this.manufacturingProcesses = manufacturingProcesses;
    }
	public Long getsupplierId(){
    	return supplierId;
    }
    public void setsupplier(long supplierId){
    	this.supplierId=supplierId;
    }
    public String getCompanyName(){
    	return companyName;
    }
    public void setcompanyName(String companyName){
    	this.companyName=companyName;
    }
    public String getwebsite(){
    	return website;
    }
    public void setwebsite(String website){
    	this.website=website;
    }
    public String getlocation(){
    	return location;
    }
    public void setlocation(String location){
    	this.location=location;
    }
    public String getnatureOfBusiness(){
    	return natureOfBusiness;
    }
    public void setnatureOfBusiness(String natureOfBusiness){
    	this.natureOfBusiness=natureOfBusiness;
    }
    public List<String> getmanufacturingProcesses(){
    	return manufacturingProcesses;
    }
    public void setmanufacturingProcesses(List<String> manufacturingProcesses){
    	this.manufacturingProcesses=manufacturingProcesses;
    }
    @SuppressWarnings("unlikely-arg-type")
	public boolean hasManufacturingProcess(List<String> manufacturingProcess) {
        return manufacturingProcesses.contains(manufacturingProcess);
    }
	public void display() {
		System.out.println("Id: "+supplierId +" Company Name: "+companyName +" location: " + location +" NatureOfBuisness: "+natureOfBusiness );
	}
}
