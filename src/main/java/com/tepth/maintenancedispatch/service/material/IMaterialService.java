package com.tepth.maintenancedispatch.service.material;

import com.tepth.maintenancedispatch.dto.GetMaterialInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.Material;
import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;

/**
 * @Author royle.huang
 * @Date 2019/2/18 16:38
 * @Description 物资service
 **/
public interface IMaterialService {
    /**
     * @Author royle.huang
     * @Date 2019/2/18 16:51
     * @Description 查询主页物料展示数据
     **/
    GetMaterialInfoResponse queryMaterialCountMainPage(BaseRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/28 11:03
     * @Description 分页查询物料列表
     **/
    PageResponse<Material> queryMaterialListByPage(PageRequest request);
}
