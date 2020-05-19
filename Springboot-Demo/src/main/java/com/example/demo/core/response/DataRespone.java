package com.example.demo.core.response;

import lombok.Data;

/**
 * @author fuyongle
 * @version 1.0
 * @date 2020-517
 */
@Data
public class DataRespone<T> {
    private int code;
    private String msg;

    private T data;
}
