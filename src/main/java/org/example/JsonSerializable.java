package org.example;

public interface JsonSerializable<T> {
    String toJson(T t);


    JsonSerializable<Integer> IntegerInstance = Object::toString;


}
