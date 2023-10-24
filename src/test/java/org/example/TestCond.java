package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCond {
   @Test
   public void testMainHeat() {
       Assertions.assertEquals(20, Cond(10,20,"heat"));
       Assertions.assertEquals(50, new Cond());
       Assertions.assertEquals(10, new Cond());
   }
   @Test
   public void testMainFreeze(){
       Assertions.assertEquals(20, 10, 20,"freeze");
       Assertions.assertEquals(10, 20, 10,"freeze");
       Assertions.assertEquals(20, 10, 40,"freeze");
   }
    @Test
    public void testMainAuto(){
        Assertions.assertEquals(20, 10, 20,"auto");
        Assertions.assertEquals(10, 10, 20,"auto");
        Assertions.assertEquals(20, 10, 40,"auto");
    }
    @Test
    public void testMainFan() {
        Assertions.assertEquals(20, 10, 20, "fan");
        Assertions.assertEquals(10, 10, 20, "fan");
        Assertions.assertEquals(20, 10, 40, "fan");
    }
}
