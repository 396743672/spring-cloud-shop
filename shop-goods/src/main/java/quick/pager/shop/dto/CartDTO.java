package quick.pager.shop.dto;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CartDTO extends AppDTO {
    private static final long serialVersionUID = -6591856362210499785L;
    /**
     * 商品id
     */
    private List<Long> goodsIds;
    /**
     * 购买商品的数量
     */
    private Integer goodsCount;
}
