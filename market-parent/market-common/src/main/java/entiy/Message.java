package entiy;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * packageName entiy
 *
 * @author 你的名字
 * @version JDK 21
 * @className Message (此处以class为例)
 * @date 2024/6/22 星期六
 * @description MQ响应信息封装
 */
public class Message {
	//执行增删改的操作
	private int code;
//	data
	private Object content;
//	发送的routeKey
	@JSONField(serialize = false)
	private String routeKey;
//	交换机
	@JSONField(serialize = false)
	private String exechange;

	public Message(int code) {
		this.code = code;
	}

	public Message(Object content, int code) {
		this.content = content;
		this.code = code;
	}
}
