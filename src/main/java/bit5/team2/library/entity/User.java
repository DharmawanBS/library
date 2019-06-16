package bit5.team2.library.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Data
@Table(name = "USER_TABLE")
public class User {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "USER_ID")
    private String userId;

    @Nullable()
    @Column(name = "USER_DOMAIN")
    private String userDomain;

    @NotEmpty
    @Column(name = "USERNAME")
    private String username;

    @NotEmpty
    @JsonIgnore
    @Column(name = "USER_PASSWORD")
    private String userPassword;

    @NotEmpty
    @Column(name = "USER_LONG_NAME")
    private String userLongName;

    @NotEmpty
    @Column(name = "USER_DOB")
    private Date userDob;

    @NotEmpty
    @Column(name = "USER_COB")
    private String userCod;

    @NotEmpty
    @Column(name = "USER_JENIS_KELAMIN")
    private String userJenisKelamin;

    @Nullable()
    @Column(name = "USER_ADDRESS")
    private String userAddress;

    @Nullable()
    @Column(name = "USER_GROUP")
    private String userGroup;

    @Nullable()
    @Column(name = "USER_TYPE")
    private String userType;

    @Nullable()
    @Column(name = "USER_MINAT")
    private String userMinat;

    @Nullable()
    @Column(name = "USER_EFF_DATE")
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date userEffDate;

    @Nullable()
    @Column(name = "USER_KANWIL_DIVISI_CD")
    private String userKanwilDivisiCd;

    @Nullable()
    @Column(name = "USER_KANWIL_DIVISI_NAME")
    private String userKanwilDivisiName;
}
