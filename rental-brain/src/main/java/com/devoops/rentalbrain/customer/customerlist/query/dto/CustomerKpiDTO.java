package com.devoops.rentalbrain.customer.customerlist.query.dto;

import lombok.Data;

@Data
public class CustomerKpiDTO {
    private Integer totalCustomers;
    private Integer vipCustomers;
    private Integer riskCustomers;
    private Integer blacklistCustomers;
}