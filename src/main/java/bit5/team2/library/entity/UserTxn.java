package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "USER_TXN_TABLE")
public class UserTxn {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "TXN_NO")
    private String txnNo;

    @NotEmpty
    @Column(name = "USER_ID")
    private String userId;

    @NotEmpty
    @Column(name = "TXN_CODE")
    private String txnCode;

    @Column(name = "TXN_AMT")
    private Integer txnAmt;
}
