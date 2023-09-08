package edu.mfvp.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Long id;
    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;

}
