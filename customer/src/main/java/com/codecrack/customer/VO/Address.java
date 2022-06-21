package com.codecrack.customer.VO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {

    private Long addressId;
    private String streetName;
    private String city;
    private int pinCode;

}
