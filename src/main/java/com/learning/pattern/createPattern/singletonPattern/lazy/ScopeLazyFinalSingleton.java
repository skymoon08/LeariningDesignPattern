package com.learning.pattern.createPattern.singletonPattern.lazy;

/**
 * 双重校验锁 - 使用 final关键字
 */
public class ScopeLazyFinalSingleton {

    private FinalWrapper<ScopeLazyFinalSingleton> helperWrapper = null;

    public ScopeLazyFinalSingleton getHelper() {
        FinalWrapper<ScopeLazyFinalSingleton> wrapper = helperWrapper;
        if (wrapper == null) {
            synchronized (this) {
                if (helperWrapper == null) {
                    helperWrapper = new FinalWrapper<>(new ScopeLazyFinalSingleton());
                }
                wrapper = helperWrapper;
            }
        }
        return wrapper.value;
    }

}
