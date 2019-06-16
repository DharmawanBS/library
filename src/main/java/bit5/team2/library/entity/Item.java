package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "ITEM_TABLE")
public class Item {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ITEM_ID")
    private String itemId;

    @NotEmpty
    @Column(name = "ITEM_CATEGORY")
    private String itemCategory;

    @NotEmpty
    @Column(name = "ITEM_NAME")
    private String itemName;

    @NotEmpty
    @Column(name = "ITEM_HARGA")
    private String itemHarga;

    @NotEmpty
    @Column(name = "IS_GACHA_IND")
    private String isGachaInd;

    @NotEmpty
    @Column(name = "GATCHA_RATE")
    private String gatchaRate;
}
