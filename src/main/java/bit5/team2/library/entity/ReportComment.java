package bit5.team2.library.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@Table(name = "REPORTED_COMMENT_TABLE")
public class ReportComment {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "COMMENT_REPORT_ID")
    private String commentReportId;

    @NotEmpty
    @Column(name = "COMMENT_ID")
    private String commentId;

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
    @Column(name = "REPORTED_COMMENT_CD")
    private String reportedCommentCd;

    @NotEmpty
    @Column(name = "COMMENT_REPORT_DESC")
    private String commentReportDesc;

    @NotEmpty
    @Column(name = "POST_ID")
    private String postId;
}
