package bit5.team2.library.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@Table(name = "CHALLENGE_TABLE")
public class Challenge {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "CHALLENGE_ID")
    private String challengeId;

    @NotEmpty
    @Column(name = "CHALLENGE_CATEGORY")
    @Size(max = 20)
    private String challengeCategory;

    @NotEmpty
    @Column(name = "CHALLENGE_NAME")
    @Size(max = 50)
    private String challengeName;

    @NotEmpty
    @Column(name = "CHALLENGE_DESC")
    @Size(max = 200)
    private String challengeDesc;

    @NotEmpty
    @Column(name = "IS_POST_IND")
    @Size(max = 1)
    private String challengeIsPostInd;

    @Column(name = "CHALLENGE_POINT")
    private Integer challengePoint;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Column(name = "CHALLENGE_END_DATE")
    private Date challengeEndDate;

    @NotEmpty
    @Column(name = "ADMIN_ID")
    private String adminId;

    @Column(name = "IS_DAILY_IND")
    @Size(max = 1)
    private String isDailyInd;

    @Column(name = "IS_WEEKLY_IND")
    @Size(max = 1)
    private String isWeeklyInd;

    @Column(name = "IS_MONTHLY_IND")
    @Size(max = 1)
    private String isMonthlyInd;

    @Column(name = "IS_SPECIAL_DAY_IND")
    @Size(max = 1)
    private String isSpecialDayInd;

    @Column(name = "SPECIAL_DAY")
    private Integer specialDay;

    @Column(name = "IS_SPECIAL_MONTH_IND")
    @Size(max = 1)
    private String isSpecialMonthInd;

    @Column(name = "SPECIAL_MONTH")
    private Integer specialMonth;

    @Column(name = "IS_SPECIAL_YEAR_IND")
    @Size(max = 1)
    private String isSpecialYearInd;

    @Column(name = "SPECIAL_YEAR")
    private Integer specialYear;
}
