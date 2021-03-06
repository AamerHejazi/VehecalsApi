package com.udacity.pricing.web;


import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.service.PricingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PricingController.class)
public class PricingControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    PricingService pricingService;

    @Test
    public void getPrice() throws Exception {
        mockMvc.perform(get("/services/price?vehicleId=5"))
                .andExpect(status().isOk());

       // {"currency":"USD","price":17103.13,"vehicleId":5}
        MvcResult result = mockMvc.perform(get("/services/price?vehicleId=5"))
                .andExpect(status().isOk()).andReturn();

        String content = result.getResponse().getContentAsString();
        System.out.println(content);
    }

}
