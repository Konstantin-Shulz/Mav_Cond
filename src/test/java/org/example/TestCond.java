package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class TestCond {
   @Test
   public void testCondHeat() throws IOException {

       Assertions.assertEquals(20, Cond.modeCond(10, 20, "heat"));
       Assertions.assertEquals(30, Cond.modeCond(10, 30, "heat"));
       Assertions.assertEquals(20, Cond.modeCond(20, 10, "heat"));
   }
    @Test
    public void testCondFreeze() throws IOException {

       Assertions.assertEquals(10, Cond.modeCond(10,20,"freeze"));
       Assertions.assertEquals(10, Cond.modeCond(30,10,"freeze"));
       Assertions.assertEquals(10, Cond.modeCond(20,10,"freeze"));
   }
    @Test
    public void testCondAuto() throws IOException {

        Assertions.assertEquals(20, Cond.modeCond(10, 20, "auto"));
        Assertions.assertEquals(30, Cond.modeCond(10, 30, "auto"));
        Assertions.assertEquals(10, Cond.modeCond(30, 10, "auto"));
    }
    @Test
    public void testCondFan() throws IOException {

        Assertions.assertEquals(10, Cond.modeCond(10, 0, "fan"));
        Assertions.assertEquals(10, Cond.modeCond(10, 30, "fan"));
        Assertions.assertEquals(30, Cond.modeCond(30, 10, "fan"));
    }
}
