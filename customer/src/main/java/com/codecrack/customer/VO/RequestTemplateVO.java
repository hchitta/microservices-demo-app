package com.codecrack.customer.VO;

import com.codecrack.customer.entity.Customer;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestTemplateVO {

    private Customer customer;
    private Address address;

}
