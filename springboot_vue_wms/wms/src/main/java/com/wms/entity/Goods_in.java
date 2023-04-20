package com.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Goods_in对象", description="")
public class Goods_in implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "名字")
    private String name;

    @ApiModelProperty(value = "仓库")
    private String storage;

    @ApiModelProperty(value = "数量")
    private String count;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "时间")
    private Date time;

    @ApiModelProperty(value = "管理员")
    private String manager;

    public String getName() {
        return this.name;
    }
}
