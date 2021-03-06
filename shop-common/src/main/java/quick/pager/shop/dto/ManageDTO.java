package quick.pager.shop.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ManageDTO extends BaseDTO {
    private static final long serialVersionUID = -198889296092773549L;

    /**
     * 系统登陆名
     */
    private String username;

    /**
     * 起始时间
     */
    private String beginTime;
    /**
     * 结束时间
     */
    private String endTime;

}
