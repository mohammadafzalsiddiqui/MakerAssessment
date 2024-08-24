package com.MakerSharks.Dealer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DealerServiceTest {
	@Autowired
    private SupplierService supplierService;
	@BeforeEach
	void empty_query_supplier() {
		supplierService.clear();
	}
	
    @Test
    void testQuerySuppliers_AllCriteria() {
        List<Supplier> result = supplierService.querySuppliers("India", "small_scale",null);
        result.stream().forEach(x -> x.display());
        assertEquals(1, result.size());
        assertEquals("TechPrint Solutions", result.get(0).getCompanyName());
    }

    @Test
    void testQuerySuppliers_LocationOnly() {
        List<Supplier> result = supplierService.querySuppliers("USA", null, null);
        result.stream().forEach(x -> x.display());
        assertEquals(1, result.size());
        assertEquals("MegaMold Manufacturing", result.get(0).getCompanyName());
    }
}
