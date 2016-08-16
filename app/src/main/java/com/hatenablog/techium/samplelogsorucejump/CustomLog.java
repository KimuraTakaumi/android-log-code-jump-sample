package com.hatenablog.techium.samplelogsorucejump;


import android.util.Log;

public class CustomLog {

    public static void d(String tag, String message) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        int index = -1;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i].getMethodName().equals("d")) {
                index = i + 1;
                break;
            }
        }

        String classNameFull = stack[index].getClassName();
        String className = classNameFull.substring(classNameFull.lastIndexOf(".") + 1);
        String methodName = stack[index].getMethodName();
        String lineNumber = String.valueOf(stack[index].getLineNumber());

        Log.d(tag, message + " at " + classNameFull + "." + methodName + "(" + className + ".java:" + lineNumber + ")");
    }

    public static void d2(String tag, String message) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        int index = -1;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i].getMethodName().equals("d2")) {
                index = i + 1;
                break;
            }
        }

        String classNameFull = stack[index].getClassName();
        String className = classNameFull.substring(classNameFull.lastIndexOf(".") + 1);
        String lineNumber = String.valueOf(stack[index].getLineNumber());

        Log.d(tag, message + "(" + className + ".java:" + lineNumber + ")");
    }

}
