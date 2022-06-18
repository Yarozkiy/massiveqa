import org.junit.jupiter.api.Test;
import ru.netology.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

@Test
    public void summ(){
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long actual = service.sum(sales);
    long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
    assertEquals (expected, actual);

}
@Test

public void findMaxMouth () {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    long actual = service.maxSale(sales);
    long expected = 7;

    assertEquals(expected, actual);

}
}
