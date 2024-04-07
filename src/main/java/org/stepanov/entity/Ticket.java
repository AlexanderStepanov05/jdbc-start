package org.stepanov.entity;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket {

    private Long id;
    private String passengerNo;
    private String passengerName;
    private Flight flight;
    private String SeatNo;
    private BigDecimal cost;
}
