package com.tepth.maintenancedispatch.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.dto.GetRepairListPagingRequest;
import com.tepth.maintenancedispatch.dto.GetStationWorkerRequest;
import com.tepth.maintenancedispatch.dto.GetWorkerInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.*;
import com.tepth.maintenancedispatch.service.repair.IRepairService;
import com.tepth.maintenancedispatch.service.user.IWorkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author royle.huang
 * @Date 2019/2/15 17:05
 * @Description 技工
 **/
@RestController
@RequestMapping("dispatch/worker")
@Slf4j
public class WorkerController {

    @Autowired
    IWorkerService workerService;

    @Autowired
    IRepairService repairService;


    /**
     * @Author royle.huang
     * @Date 2019/2/22 17:35
     * @Description 员工作业记录列表
     **/
    @PostMapping("/repair")
    public PageResponse<RepairVO> queryRepairListByPage(@RequestBody String json){
        GetRepairListPagingRequest request = JSONObject.parseObject(json, GetRepairListPagingRequest.class);
        PageResponse<RepairVO> response  = repairService.queryRepairListByPageComm(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/22 9:06
     * @Description 员工列表
     **/
    @PostMapping("/list")
    public BaseResponse queryWorkerListByPage(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        PageResponse<Worker> response = workerService.queryWorkerListByPage(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/28 16:44
     * @Description 工位作业人员列表
     **/
    @PostMapping("/area")
    public PageResponse<Worker> queryWorkerListWorkStation(@RequestBody String json){
        GetStationWorkerRequest request = JSONObject.parseObject(json, GetStationWorkerRequest.class);
        PageResponse<Worker> response = workerService.queryWorkerListWorkStation(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/28 15:02
     * @Description 空闲人员列表
     **/
    @PostMapping("/idle")
    public BaseResponse queryWorkerListByPageIdle(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        request.setKeyWord("idle");
        PageResponse<Worker> response = workerService.queryWorkerListByPage(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/15 17:11
     * @Description 查询主页面显示的技工信息
     **/
    @PostMapping("/count")
    public BaseResponse queryWorkersMainPage(@RequestBody String json) {
        BaseRequest request = JSONObject.parseObject(json, BaseRequest.class);
        GetWorkerInfoResponse response = workerService.queryWorkersMainPage(request);
        return response;
    }

}
