package com.axies.snake.ladders.util;

public class LoggerUtil {
    public static String getClassName(Class<?> clazz) {
        return clazz.getSimpleName();
    }
    public static String getMethodName(StackTraceElement element) {
        return element.getMethodName();
    }
}
