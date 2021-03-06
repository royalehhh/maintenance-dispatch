package com.tepth.maintenancedispatch.comm;

public class ErrorConstant {


    //当前工位正在作业
    public static Integer STATION_WORKING_CODE= 301001;
    public static String STATION_WORKING_MSG= "当前工位已有车辆作业";

    //不存在
    //请求错误
    public static Integer USER_ROLE_ERROR_CODE= 404000;
    public static String USER_ROLE_ERROR_MSG= "用户不是机调员";
    public static Integer DATABASE_NO_DATA_CODE= 404001;
    public static String DATABASE_NO_DATA_MSG= "database no data";



    //无访问权限
    public static Integer PARAM_INCOMPLETE_CODE= 500000;
    public static String PARAM_INCOMPLETE_MSG= "param incomplete";
    public static Integer NO_PERMISSION_CODE= 501000;
    public static String NO_PERMISSION_MSG= "permission denied";

}
