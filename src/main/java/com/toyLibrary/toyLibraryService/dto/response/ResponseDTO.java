package com.toyLibrary.toyLibraryService.dto.response;

public class ResponseDTO<T> {
    private T body;
    private Integer statusCode;
    private String message;

    public ResponseDTO(T body, Integer statusCode, String message) {
        this.body = body;
        this.statusCode = statusCode;
        this.message = message;
    }

    public ResponseDTO(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
