package com.xzl.bat.domain.dto.push;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MsgInfo implements Serializable {
    private String noticeMsg;

    private List<String> picurl;

    private String tasktype;

    private String community;

    private String registercode;

    private String liftdesc;

    private String maintenancedate;

    private String taskid;

    private String refusedperson;

    private String refusedResult;

    private Integer liftnum;

    private Integer tasknum;

    private List<MaintenanceInfo> maintenanceinfo;

}
