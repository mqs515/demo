package com.test.demo.bo;

import lombok.Data;

/**
 * @author ：miaoqs
 * @date ：2019-06-04 15:12
 * @description：111
 */
@Data
public class JsonRootBean {
    private com.test.demo.bo.Data data;
    private int status;
    private String message;
    private long serverTime;
}
