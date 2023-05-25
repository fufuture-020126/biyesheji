package com.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Storage对象", description="")
public class Storage implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "仓库名")
    private String name;
    @ApiModelProperty(value = "备注")
    private String remark;
    @ApiModelProperty(value = "归属管理员")
    private String manager;
    @ApiModelProperty(value = "最大容量")
    private int max;
    @ApiModelProperty(value = "当前承载量")
    private int now;
    @ApiModelProperty(value = "最近刷新时间")
    private Date refreshTime;
    @ApiModelProperty(value = "仓库地址")
    private String address;
    public String getName() {
        return this.name;
    }
    public String getManager() { return this.manager; }
}
