package com.test.seckillv1.vo;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import com.test.seckillv1.validator.IsMobile;


/**
 * 登录参数
 *
 */
@Data
public class LoginVo {
	@NotNull
	@IsMobile
	private String mobile;

	@NotNull
	@Length(min = 32)
	private String password;

}