//
//
package com.zxwcbj.ccyx.vo.acl;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 用户查询实体
 * </p>
 *
 * @author syoukan
 */
@Data
@ApiModel(description = "用户查询实体")
public class AdminQueryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "姓名")
    private String name;

}

