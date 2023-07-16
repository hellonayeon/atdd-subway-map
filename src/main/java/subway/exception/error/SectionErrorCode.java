package subway.exception.error;

import org.springframework.http.HttpStatus;

public enum SectionErrorCode {

    NO_MATCH_UP_STATION(HttpStatus.BAD_REQUEST, "구간의 상행역과 노선의 하행 종점역이 일치하지 않습니다.")
    ;

    private HttpStatus statusCode;
    private String message;

    SectionErrorCode(HttpStatus statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}