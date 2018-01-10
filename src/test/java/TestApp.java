package com.maxo;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestApp {
    @Test
    public void testhello() {
       HelloWorld hello = new HelloWorld();
       String name="Hello";
       Assert.assertEquals("Hello", name);
    }
}
