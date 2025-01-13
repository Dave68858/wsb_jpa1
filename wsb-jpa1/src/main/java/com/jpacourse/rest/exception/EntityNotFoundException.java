package com.jpacourse.rest.exception;

public class EntityNotFoundException extends RuntimeException
{

    public EntityNotFoundException(Long id)
    {
        super("Could not find entity of id " + id);
    }
}
