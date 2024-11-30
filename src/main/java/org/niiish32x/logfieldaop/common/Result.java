package org.niiish32x.logfieldaop.common;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 接口结果
 */
@Data
@Builder
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -5202065562748397103L;

    private static final int SUCCESS_CODE = 200;
    private static final int DEFAULT_ERROR_CODE = 500;

    private static final String SUCCESS = "SUCCESS";
    private static final String FAILED = "FAILED";

    /**
     * 结果码值
     */
    private int code;

    /**
     * 结果数据
     */
    private T data;

    /**
     * 结果消息
     */
    private String message;

    /**
     * 为了兼容早期的返回信息
     */
    private String msg;

    /**
     * debug信息，便于排查问题
     */
    private String debug;

    public Result() {
    }

    public boolean isSuccess() {
        return code == SUCCESS_CODE;
    }

}

