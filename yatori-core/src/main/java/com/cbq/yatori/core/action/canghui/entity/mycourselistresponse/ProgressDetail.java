package com.cbq.yatori.core.action.canghui.entity.mycourselistresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.Data
public class ProgressDetail {
    /**
     * 这个是用于存相应视屏学时状态的
     */
    @JsonProperty("data")
    private List<ProgressDetailDatum> data;
}
