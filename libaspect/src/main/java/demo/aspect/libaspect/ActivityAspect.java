package demo.aspect.libaspect;

import android.util.Log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ActivityAspect {

    private static final String TAG = ActivityAspect.class.getSimpleName();

    @Before("execution(void onCreate(android.os.Bundle))")
    public void beforeOnCreate() {
        Log.i(TAG, "beforeOnCreate");
    }

    @After("execution(void onCreate(android.os.Bundle))")
    public void afterOnCreate() {
        Log.i(TAG, "afterOnCreate");
    }

}
