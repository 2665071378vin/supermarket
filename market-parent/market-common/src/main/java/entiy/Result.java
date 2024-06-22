package entiy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回实体bean
 */
@ApiModel(description = "Result", value = "Result")
public class Result<T> {
	@ApiModelProperty(value = "执行是否成功，true:成功;false:失败", required = true)
	private boolean flag;//是否成功
	@ApiModelProperty(value = "返回状态码，20000:成功,返回状态码,20001:失败,返回状态码,20002:用户名或密码错误,返回状态码,20003:权限不足", required = true)
	private Integer code;//返回码
	@ApiModelProperty(value = "提示信息", required = true)
	private String message;//返回消息
	@ApiModelProperty(value = "逻辑数据", required = true)
	private T date;//返回数据

	public Result(String message, Integer code, boolean flag) {
		this.message = message;
		this.code = code;
		this.flag = flag;
	}

	public Result(boolean flag, Integer code, String message, Object date) {
		this.flag = flag;
		this.code = code;
		this.message = message;
		this.date = (T) date;
	}
}
