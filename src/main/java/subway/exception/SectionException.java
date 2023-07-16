package subway.exception;

import org.springframework.http.HttpStatus;
import subway.exception.error.SectionErrorCode;

public class SectionException extends RuntimeException {

    private final HttpStatus statusCode;

    public SectionException(SectionErrorCode errorCode) {
        super(errorCode.getMessage());
        this.statusCode = errorCode.getStatusCode();
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }
}
