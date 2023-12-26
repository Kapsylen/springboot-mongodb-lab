package com.example.mongodbtest.domain.error;


public class ResourceNotFoundException extends BaseException {

  public ResourceNotFoundException(ErrorCode errorCode, String message) {
    super(errorCode,message);
  }
  }