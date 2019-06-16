package bit5.team2.library.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Data
@Table(name = "REPORTED_POST_TABLE")
public class ReportedPost {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "POST_REPORT_ID")
    private String postReportId;

    @NotEmpty
    @Column(name = "POST_ID")
    private String postId;

    @NotEmpty
    @Column(name = "REPORTING_USER_ID")
    private String reportingUserId;

    @NotEmpty
    @Column(name = "REPORTED_USER_ID")
    private String reportedUserId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "REPORTED_DATE")
    private Date reportedDate;

    @NotEmpty
    @Column(name = "POST_REPORT_DESC")
    private String postReportDesc;
}
