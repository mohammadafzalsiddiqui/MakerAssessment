package com.MakerSharks.Dealer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @PostMapping("/api/supplier/query")
    public List<Supplier> querySuppliers(@RequestBody SupplierQueryRepo request) {
    	return supplierService.querySuppliers(
                request.getlocation(),
                request.getnatureOfBusiness(),
                request.getmanufacturingProcess()
        );
    }
}