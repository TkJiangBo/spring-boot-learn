package MTVA.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "bs_product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    String name; /* 产品名称描述 */
    String status; /* 状态 */
    String briefDescribe; /* 产品简介 */
    String productNumber; /* 产品sku */
    Long stockNumber; /* 库存 */
    String detail; /* 产品详细描述 */
    String remark; /* 备注 */
    Long arriveOfGoodInterval; /* 到货间隔时间 */
    String unit; /* 产品单位 */
}
