package com.tepth.maintenancedispatch.dto.inner;


import lombok.Data;

import java.util.List;

/**
 * @Author royle.huang
 * @Date 2019/2/1 14:22
 * @Description 分页查询结果通用类
 **/
@Data
public class PageResponse<T> extends BaseResponse {

    private Integer totalCount;
    private Integer totalPage;
    private List<T> pageList;
}
