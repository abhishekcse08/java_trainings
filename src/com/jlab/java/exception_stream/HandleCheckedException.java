package com.jlab.java.exception_stream;

@FunctionalInterface
public interface HandleCheckedException<T,exObj extends Exception> {

    public void accept(T t) throws exObj;


}
