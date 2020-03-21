package demo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void shouldCalculateCorrectSumAndProduct() {
        Assert.assertEquals(10, new ProductService().product(2, 5));
        Assert.assertEquals(5, new SumService().sum(2, 3));
    }
}
