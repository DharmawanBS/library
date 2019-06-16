package bit5.team2.library.output;

public class ResultEntity<T> {
    private String errorCode;
    private String errorMessage;
    private T data;

    public ResultEntity(T pData, ErrorCode pErrorCode) {
        this.errorCode = pErrorCode.toString();
        this.errorMessage = pErrorCode.getMessage();
        this.data = pData;
    }

    public ResultEntity(T pData, ErrorCode pErrorCode, String pCustomError) {
        this.errorCode = pErrorCode.toString();
        this.errorMessage = pCustomError;
        this.data = pData;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public T getData() {
        return this.data;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResultEntity)) {
            return false;
        } else {
            ResultEntity<?> other = (ResultEntity)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$errorCode = this.getErrorCode();
                    Object other$errorCode = other.getErrorCode();
                    if (this$errorCode == null) {
                        if (other$errorCode == null) {
                            break label47;
                        }
                    } else if (this$errorCode.equals(other$errorCode)) {
                        break label47;
                    }

                    return false;
                }

                Object this$errorMessage = this.getErrorMessage();
                Object other$errorMessage = other.getErrorMessage();
                if (this$errorMessage == null) {
                    if (other$errorMessage != null) {
                        return false;
                    }
                } else if (!this$errorMessage.equals(other$errorMessage)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    private boolean canEqual(final Object other) {
        return other instanceof ResultEntity;
    }

    public String toString() {
        return "ResultEntity(errorCode=" + this.getErrorCode() + ", errorMessage=" + this.getErrorMessage() + ", data=" + this.getData() + ")";
    }
}
