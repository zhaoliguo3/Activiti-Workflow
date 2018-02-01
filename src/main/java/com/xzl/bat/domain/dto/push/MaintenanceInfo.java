package com.xzl.bat.domain.dto.push;

import lombok.Data;

import java.io.Serializable;

@Data
public class MaintenanceInfo implements Serializable {
    private String person;

    private String phone;
}
