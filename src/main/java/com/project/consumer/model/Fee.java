package com.project.consumer.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fee implements Serializable {


    private Integer id;
    private Integer electricity_bill;
    private Integer gas_bill;
    private Integer water_bill;
    private Integer dues;
    private Integer flat_id;
    private Integer totalFee;

}
