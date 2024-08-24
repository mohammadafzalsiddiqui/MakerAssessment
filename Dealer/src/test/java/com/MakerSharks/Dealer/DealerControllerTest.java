package com.MakerSharks.Dealer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import java.util.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@WebMvcTest(SupplierController.class)
class DealerControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private SupplierService supplierService;
    @Autowired
    private ObjectMapper objectMapper;
    @Test
    void testQuerySuppliers() throws Exception {
    	List<String> l= new ArrayList<>();
    	l.add("3d_printing");
    	l.add("coating");
    	Supplier supplier = new Supplier(1L, "TechPrint Solutions", "https://techprintsolutions.com", "India", "small_scale", l);
    	
        List<Supplier> suppliers = Arrays.asList(supplier);

        when(supplierService.querySuppliers(anyString(), anyString(), anyList())).thenReturn(suppliers);

        SupplierQueryRepo request = new SupplierQueryRepo();
        request.setLocation("India");
        request.setNatureOfBusiness("small_scale");
        request.setManufacturingProcess(l);

        mockMvc.perform(post("/api/supplier/query")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].supplierId").value(1))
                .andExpect(jsonPath("$[0].companyName").value("TechPrint Solutions"))
                .andExpect(jsonPath("$[0].location").value("India"))
                .andExpect(jsonPath("$[0].natureOfBusiness").value("small_scale"))
                .andExpect(jsonPath("$[0].manufacturingProcesses[0]").value("3d_printing"));
    }
}
