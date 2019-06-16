package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@Table(name = "GROUP_TABLE")
public class Group {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "GROUP_ID")
    private String groupId;

    @NotEmpty
    @Column(name = "IS_PARTY_IND")
    @Size(max = 1)
    private String isPartyInd;

    @NotEmpty
    @Column(name = "GROUP_DESC")
    private String groupDesc;

    @Column(name = "PartyCap")
    private Integer partyCap;

    @NotEmpty
    @Column(name = "IS_OPEN_IND")
    @Size(max = 1)
    private String isOpenInd;

    @Column(name = "GROUP_START_DATE")
    private Date groupStartDate;

    @Column(name = "GROUP_END_DATE")
    private Date groupEndDate;

    @Column(name = "PARTY_START_DATE")
    private String partyStartDate;

    @Column(name = "PARTY_END_DATE")
    private Date partyEndDate;

    @Column(name = "PARTY_END_METHOD")
    private String partyEndMethod;
}
