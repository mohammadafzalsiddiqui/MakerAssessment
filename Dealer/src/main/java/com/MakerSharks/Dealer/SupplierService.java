package com.MakerSharks.Dealer;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class SupplierService {
    private List<Supplier> suppliers = new ArrayList<>();
    String[] array = {"Coating" ," moulding" , "Casting"};
    List<String> Process = Arrays.asList(array);
    public List<Supplier> querySuppliers(String location, String natureOfBusiness, List<String> manufacturingProcess) {
    	
    	// Adding test details
        suppliers.add(new Supplier(1L, "TechPrint Solutions", "https://techprintsolutions.com", "India", "small_scale",Process));
        suppliers.add(new Supplier(2L, "MegaMold Manufacturing", "https://megamold.com", "USA", "large_scale", Process));
        suppliers.add(new Supplier(3L, "Precision Parts Ltd", "https://precisionparts.co.uk", "UK", "medium_scale",Process));

        // Performing search queries
        return suppliers.stream()
                .filter(s -> {
                	 return location == null || s.getlocation().equalsIgnoreCase(location);
                })
                .filter(s -> natureOfBusiness == null || s.getnatureOfBusiness().equalsIgnoreCase(natureOfBusiness))
                .filter(s -> manufacturingProcess == null || s.hasManufacturingProcess(manufacturingProcess))
                .collect(Collectors.toList());
    }
    public void clear() {
    	suppliers.clear();
    }
}
