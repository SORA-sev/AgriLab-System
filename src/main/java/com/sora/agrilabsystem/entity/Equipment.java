package com.sora.agrilabsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("equipment")
public class Equipment {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String equipCode;
    private String name;
    private String model;
    private String category;
    private Long managerId;
    private Integer status;
    private LocalDateTime createTime;
    private LocalDate purchaseDate;
}
