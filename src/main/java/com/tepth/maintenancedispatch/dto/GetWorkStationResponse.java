package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.WorkStation;
import lombok.Data;

import java.util.List;

@Data
public class GetWorkStationResponse extends BaseResponse {

    List<WorkStation> workStation;
}
