package com.deyunjiaoyu.sportplay.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QueryInfo {
    private String query;//查询信息 username
    private int pageStart=1;//当前页
    private int pageSize=1;//每页最大数

}
