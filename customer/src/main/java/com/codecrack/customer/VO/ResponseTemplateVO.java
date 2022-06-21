package com.codecrack.customer.VO;

import com.codecrack.customer.entity.Customer;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseTemplateVO {

    private Customer customer;
    private Address address;

}
