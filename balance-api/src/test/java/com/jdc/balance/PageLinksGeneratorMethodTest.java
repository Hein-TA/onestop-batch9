package com.jdc.balance;


import com.jdc.balance.api.output.PageInfo;
import com.jdc.balance.model.utils.PageLinksFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PageLinksGeneratorMethodTest {

    @ParameterizedTest
    @CsvSource(value = {
            "5 0 0,1,2,3,4",
            "2 1 0,1",
            "10 7 5,6,7,8,9",
            "10 9 5,6,7,8,9",
            "10 6 4,5,6,7,8"
    }, delimiter = ' ')
    void test(int total, int current, @AggregateWith(LinksAggregator.class) List<Integer> links) {
        var result = PageLinksFactory.getPageLink(total, current);
        assertNotNull(result);

        assertEquals(links.size(), result.size());

        for(var i = 0; i < links.size(); i++) {
            assertEquals(links.get(i), result.get(i));
        }
    }
}
