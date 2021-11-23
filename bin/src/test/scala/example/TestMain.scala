package example;

import org.testng.Assert;
import org.testng.annotations.Test;

class TestMain {
    @Test
    def getGreeting(): Unit = {
        val test = example.Main.greeting("Steve");
        val expected = "Hello World, Steve";
        Assert.assertEquals(expected, test);
    }
}
