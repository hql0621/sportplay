package com.deyunjiaoyu.sportplay.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

//分支导航
@Data
@AllArgsConstructor
public class SubMenu {
    private int id;
    private String title;
    private String path;
}
