package cn.ybetter.download.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * (Hero)实体类
 *
 * @author makejava
 * @since 2020-05-23 11:07:02
 */

@Data
public class Hero implements Serializable {
    private static final long serialVersionUID = 517677007919872943L;

    @ExcelProperty("id")
    private Integer id;

    @ExcelProperty("英雄名")
    private String name;

    @ExcelProperty("英雄生命值")
    private Float hp;

    @ExcelProperty("英雄伤害")
    private Integer damage;

}