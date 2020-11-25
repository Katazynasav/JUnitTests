package example6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class PortfolioTest {
    private static Portfolio portfolio;
    private static StockService stockService;

    @BeforeAll
    public static void setUp(){
        //Create portfolio object which needs to be tested
        portfolio = new Portfolio();
        //Create mock for object StockService (fake behavior)
        stockService = mock(StockService.class);

        portfolio.setStockService(stockService);
    }

    @Test
    void getMarketValue() {
        //given
        List<Stock> stocks = new ArrayList<>();
        Stock googleStock = new Stock("1","gugle",2);
        Stock microsoftStock = new Stock("2","maikrasoft",2);
        stocks.add(googleStock);
        stocks.add(microsoftStock);
        portfolio.setStocks(stocks);

        //when
        //mock the behavior of the service which we are dependant on
        when(stockService.getPrice(googleStock)).thenReturn(50.00);
        when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);

        //then
        assertEquals(2100,portfolio.getMarketValue());

        when(stockService.getPrice(googleStock)).thenReturn(0.00);
        when(stockService.getPrice(microsoftStock)).thenReturn(0.00);

        //then
        assertEquals(0,portfolio.getMarketValue());
    }
}