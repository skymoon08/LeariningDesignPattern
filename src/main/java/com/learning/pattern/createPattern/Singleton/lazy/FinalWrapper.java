package com.learning.pattern.createPattern.Singleton.lazy;

/**
 * 双重校验锁 - 使用 final关键字
 *
 * @param <T>
 */
public class FinalWrapper<T> {

    public final T value;

    public FinalWrapper(T value) {
        this.value = value;
    }
}
