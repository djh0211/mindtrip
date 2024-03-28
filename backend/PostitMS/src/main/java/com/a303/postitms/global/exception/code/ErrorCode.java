package com.a303.postitms.global.exception.code;

import lombok.Getter;

@Getter
public enum ErrorCode {
    /**
     * ******************************* Global Error CodeList ***************************************
     * HTTP Status Code
     * 400 : Bad Request
     * 401 : Unauthorized
     * 403 : Forbidden
     * 404 : Not Found
     * 409 : Conflict
     * 500 : Internal Server Error
     * *********************************************************************************************
     */
    // 잘못된 서버 요청
    BAD_REQUEST_ERROR(400, "G001", "Bad Request Exception"),

    // @RequestBody 데이터 미 존재
    REQUEST_BODY_MISSING_ERROR(400, "G002", "Required request body is missing"),

    // 유효하지 않은 타입
    INVALID_TYPE_VALUE(400, "G003", " Invalid Type Value"),

    // Request Parameter 로 데이터가 전달되지 않을 경우
    MISSING_REQUEST_PARAMETER_ERROR(400, "G004", "Missing Servlet RequestParameter Exception"),

    // 입력/출력 값이 유효하지 않음
    IO_ERROR(400, "G005", "I/O Exception"),

    // com.google.gson JSON 파싱 실패
    JSON_PARSE_ERROR(400, "G006", "JsonParseException"),

    // com.fasterxml.jackson.core Processing Error
    JACKSON_PROCESS_ERROR(400, "G007", "com.fasterxml.jackson.core Exception"),

    // 권한이 없음
    FORBIDDEN_ERROR(403, "G008", "Forbidden Exception"),

    // 서버로 요청한 리소스가 존재하지 않음
    NOT_FOUND_ERROR(404, "G009", "Not Found Exception"),

    // NULL Point Exception 발생
    NULL_POINT_ERROR(404, "G010", "Null Point Exception"),

    // @RequestBody 및 @RequestParam, @PathVariable 값이 유효하지 않음
    NOT_VALID_ERROR(404, "G011", "handle Validation Exception"),

    // @RequestBody 및 @RequestParam, @PathVariable 값이 유효하지 않음
    NOT_VALID_HEADER_ERROR(404, "G012", "Header에 데이터가 존재하지 않는 경우 "),

    // 서버가 처리 할 방법을 모르는 경우 발생
    INTERNAL_SERVER_ERROR(500, "G999", "Internal Server Error Exception"),
    // 파일 업로드 실패
    FAILED_TO_UPLOAD_FILE(600, "F001", "S3 파일 업로드 실패"),

    /**
     * ******************************* Business Error CodeList ***************************************
     */

    UNAUTHORIZED_USER_EXCEPTION(403, "B100", "권한이 없는 사용자입니다."),
    STORAGE_COUNT_EXCEEDED(403, "B101", "저장 가능한 임시저장 개수를 초과했습니다."),
    INVALID_REFRESH_TOKEN_EXCEPTION(403, "B102", "유효하지 않은 리프레시 토큰입니다."),
    EXPIRED_REFRESH_TOKEN_EXCEPTION(403, "B103", "만료된 리프레시 토큰입니다."),
    INCONSISTENT_REFRESH_TOKEN_EXCEPTION(403, "B104", "일치하지 않는 리프레시 토큰입니다."),
    NOT_SUPPORTED_CRAWLING_EXCEPTION(403, "B105", "지원하지 않는 사이트입니다."),

    // 유저가 존재하지 않음
    NOT_FOUND_USER_EXCEPTION(404, "B200", "존재하지 않는 유저입니다."),
    NOT_FOUND_ITEM_EXCEPTION(404, "B201", "존재하지 않는 아이템입니다."),
    NOT_FOUND_POST_EXCEPTION(404, "B202", "존재하지 않는 글입니다."),

    NOT_FOUND_ARCHIVE_EXCEPTION(404, "B203", "존재하지 않는 아카이브입니다."),

    // 포스트잇 관련 에러코드
    FORBIDDEN_ERROR_CREATOR(403, "B304", "포스트잇 작성자만 삭제 가능합니다"),

    FORBIDDEN_ERROR_DAY(403, "B303", "당일 주제에 대해서만 등록/삭제가 가능합니다."),

    // 포스트잇 주제가 존재하지 않음
    NOT_FOUND_POSTIT_TOPIC_EXCEPTION(404, "B300", "존재하지 않는 주제입니다."),

    NOT_FOUND_POSTIT_EXCEPTION(404, "B301", "존재하지 않는 포스트잇입니다."),
    // 이미 포스트잇을 등록하였습니다.
    POSTIT_ALREADY_EXISTS(404, "B302", "이미 포스트잇을 등록하였습니다."),

    POSTIT_ALREADY_LIKE(404, "B303", "이미 좋아요를 등록하였습니다."),
    NOT_FOUND_POSTIT_LIKE(404, "B304", "좋아요 하지 않은 포스티잇입니다."),

    POSTIT_ALREADY_REPORT(404, "B305", "이미 신고한 포스트잇입니다."),
    NOT_FOUND_POSTIT_REPORT(404, "B306", "신고하지 않은 포스트잇입니다."),

    // Transaction Update Error
    UPDATE_ERROR(200, "B400", "Update Transaction Error Exception"),

    // Transaction Delete Error
    DELETE_ERROR(200, "B401", "Delete Transaction Error Exception"),

    ; // End

    /**
     * ******************************* Error Code Constructor ***************************************
     */
    // 에러 코드의 '코드 상태'을 반환한다.
    private final int status;

    // 에러 코드의 '코드간 구분 값'을 반환한다.
    private final String divisionCode;

    // 에러 코드의 '코드 메시지'을 반환한다.
    private final String message;

    // 생성자 구성
    ErrorCode(final int status, final String divisionCode, final String message) {
        this.status = status;
        this.divisionCode = divisionCode;
        this.message = message;
    }
}
