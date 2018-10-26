package com.hitsme.springboot.demo.demo;

import lombok.Data;

import java.io.Serializable;
@Data
public class test implements Serializable {
    private static final long serialVersionUID = 7867076197626216829L;

    private Integer code;
    private String message;
    private Object data;
}
