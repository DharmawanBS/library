package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "ITEM_USER_TABLE")
public class ItemUser {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ITEM_USER_REL_ID")
    private String itemUserRelId;

    @NotEmpty
    @Column(name = "ITEM_ID")
    private String itemId;

    @NotEmpty
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "INVENTORY_NO")
    private Integer inventoryNo;
}
