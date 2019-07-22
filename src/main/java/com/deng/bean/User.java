package com.deng.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private int id;//编号
    private  String name;//姓名
    private int  age;//年龄
}
