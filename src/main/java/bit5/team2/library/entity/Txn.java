package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@Table(name = "TXN_TABLE")
public class Txn {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "TXN_CODE")
    private String txnCode;

    @NotEmpty
    @Column(name = "TXN_DESC")
    @Size(max = 200)
    private String txnDesc;
}
