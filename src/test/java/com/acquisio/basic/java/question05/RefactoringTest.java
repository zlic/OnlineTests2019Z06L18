package com.acquisio.basic.java.question05;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;


@RunWith(Parameterized.class)
public class RefactoringTest {

    @Parameterized.Parameter
    public String name=null;
    @Parameterized.Parameter(value = 1)
    public int sellIn;
    @Parameterized.Parameter(value = 2)
    public int quality;
    @Parameterized.Parameter(value = 3)
    public String expectedName;
    @Parameterized.Parameter(value = 4)
    public int expectedSellIn;
    @Parameterized.Parameter(value = 5)
    public int expectedQuality;

    @Parameterized.Parameters(name = "Run {index}: name={0}, sellIn={1}, quality={2}, expectedName={3}, expectedSellIn={4}, expectedQuality={5}")
    public static Iterable<Object[]> data() throws Throwable
    {
        return Arrays.asList(new Object[][] {
                { "Aged Brie", -1, 0, "Aged Brie", -2, 2 },
                { "Aged Brie", -1, 1, "Aged Brie", -2, 3 },
                { "Aged Brie", -1, 49, "Aged Brie", -2, 50 },
                { "Aged Brie", -1, 50, "Aged Brie", -2, 50 },
                { "Aged Brie", 0, 0, "Aged Brie", -1, 2 },
                { "Aged Brie", 0, 1, "Aged Brie", -1, 3 },
                { "Aged Brie", 0, 49, "Aged Brie", -1, 50 },
                { "Aged Brie", 0, 50, "Aged Brie", -1, 50 },
                { "Aged Brie", 5, 0, "Aged Brie", 4, 1 },
                { "Aged Brie", 5, 1, "Aged Brie", 4, 2 },
                { "Aged Brie", 5, 49, "Aged Brie", 4, 50 },
                { "Aged Brie", 5, 50, "Aged Brie", 4, 50 },
                { "Aged Brie", 6, 0, "Aged Brie", 5, 1 },
                { "Aged Brie", 6, 1, "Aged Brie", 5, 2 },
                { "Aged Brie", 6, 49, "Aged Brie", 5, 50 },
                { "Aged Brie", 6, 50, "Aged Brie", 5, 50 },
                { "Aged Brie", 10, 0, "Aged Brie", 9, 1 },
                { "Aged Brie", 10, 1, "Aged Brie", 9, 2 },
                { "Aged Brie", 10, 49, "Aged Brie", 9, 50 },
                { "Aged Brie", 10, 50, "Aged Brie", 9, 50 },
                { "Aged Brie", 11, 0, "Aged Brie", 10, 1 },
                { "Aged Brie", 11, 1, "Aged Brie", 10, 2 },
                { "Aged Brie", 11, 49, "Aged Brie", 10, 50 },
                { "Aged Brie", 11, 50, "Aged Brie", 10, 50 },
                { "Backstage passes to a TAFKAL80ETC concert", -1, 0, "Backstage passes to a TAFKAL80ETC concert", -2, 0 },
                { "Backstage passes to a TAFKAL80ETC concert", -1, 1, "Backstage passes to a TAFKAL80ETC concert", -2, 0 },
                { "Backstage passes to a TAFKAL80ETC concert", -1, 49, "Backstage passes to a TAFKAL80ETC concert", -2, 0 },
                { "Backstage passes to a TAFKAL80ETC concert", -1, 50, "Backstage passes to a TAFKAL80ETC concert", -2, 0 },
                { "Backstage passes to a TAFKAL80ETC concert", 0, 0, "Backstage passes to a TAFKAL80ETC concert", -1, 0 },
                { "Backstage passes to a TAFKAL80ETC concert", 0, 1, "Backstage passes to a TAFKAL80ETC concert", -1, 0 },
                { "Backstage passes to a TAFKAL80ETC concert", 0, 49, "Backstage passes to a TAFKAL80ETC concert", -1, 0 },
                { "Backstage passes to a TAFKAL80ETC concert", 0, 50, "Backstage passes to a TAFKAL80ETC concert", -1, 0 },
                { "Backstage passes to a TAFKAL80ETC concert", 5, 0, "Backstage passes to a TAFKAL80ETC concert", 4, 3 },
                { "Backstage passes to a TAFKAL80ETC concert", 5, 1, "Backstage passes to a TAFKAL80ETC concert", 4, 4 },
                { "Backstage passes to a TAFKAL80ETC concert", 5, 49, "Backstage passes to a TAFKAL80ETC concert", 4, 50 },
                { "Backstage passes to a TAFKAL80ETC concert", 5, 50, "Backstage passes to a TAFKAL80ETC concert", 4, 50 },
                { "Backstage passes to a TAFKAL80ETC concert", 6, 0, "Backstage passes to a TAFKAL80ETC concert", 5, 2 },
                { "Backstage passes to a TAFKAL80ETC concert", 6, 1, "Backstage passes to a TAFKAL80ETC concert", 5, 3 },
                { "Backstage passes to a TAFKAL80ETC concert", 6, 49, "Backstage passes to a TAFKAL80ETC concert", 5, 50 },
                { "Backstage passes to a TAFKAL80ETC concert", 6, 50, "Backstage passes to a TAFKAL80ETC concert", 5, 50 },
                { "Backstage passes to a TAFKAL80ETC concert", 10, 0, "Backstage passes to a TAFKAL80ETC concert", 9, 2 },
                { "Backstage passes to a TAFKAL80ETC concert", 10, 1, "Backstage passes to a TAFKAL80ETC concert", 9, 3 },
                { "Backstage passes to a TAFKAL80ETC concert", 10, 49, "Backstage passes to a TAFKAL80ETC concert", 9, 50 },
                { "Backstage passes to a TAFKAL80ETC concert", 10, 50, "Backstage passes to a TAFKAL80ETC concert", 9, 50 },
                { "Backstage passes to a TAFKAL80ETC concert", 11, 0, "Backstage passes to a TAFKAL80ETC concert", 10, 1 },
                { "Backstage passes to a TAFKAL80ETC concert", 11, 1, "Backstage passes to a TAFKAL80ETC concert", 10, 2 },
                { "Backstage passes to a TAFKAL80ETC concert", 11, 49, "Backstage passes to a TAFKAL80ETC concert", 10, 50 },
                { "Backstage passes to a TAFKAL80ETC concert", 11, 50, "Backstage passes to a TAFKAL80ETC concert", 10, 50 },
                { "foo", -1, 0, "foo", -2, 0 },
                { "foo", -1, 1, "foo", -2, 0 },
                { "foo", -1, 49, "foo", -2, 47 },
                { "foo", -1, 50, "foo", -2, 48 },
                { "foo", 0, 0, "foo", -1, 0 },
                { "foo", 0, 1, "foo", -1, 0 },
                { "foo", 0, 49, "foo", -1, 47 },
                { "foo", 0, 50, "foo", -1, 48 },
                { "foo", 5, 0, "foo", 4, 0 },
                { "foo", 5, 1, "foo", 4, 0 },
                { "foo", 5, 49, "foo", 4, 48 },
                { "foo", 5, 50, "foo", 4, 49 },
                { "foo", 6, 0, "foo", 5, 0 },
                { "foo", 6, 1, "foo", 5, 0 },
                { "foo", 6, 49, "foo", 5, 48 },
                { "foo", 6, 50, "foo", 5, 49 },
                { "foo", 10, 0, "foo", 9, 0 },
                { "foo", 10, 1, "foo", 9, 0 },
                { "foo", 10, 49, "foo", 9, 48 },
                { "foo", 10, 50, "foo", 9, 49 },
                { "foo", 11, 0, "foo", 10, 0 },
                { "foo", 11, 1, "foo", 10, 0 },
                { "foo", 11, 49, "foo", 10, 48 },
                { "foo", 11, 50, "foo", 10, 49 }
        });
    }

    @Test
    public void testUpdateQuality() {
        Item[] items = new Item[]{new Item(name, sellIn, quality)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals(expectedName, app.items[0].name);
        assertEquals(expectedSellIn, app.items[0].sellIn);
        assertEquals(expectedQuality, app.items[0].quality);
    }

    public void generateTestData(){
        String[] names = new String[]{"Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros", "foo"};
        Integer[] sellIns = new Integer[]{-1, 0, 5, 6, 10, 11};
        Integer[] qualities = new Integer[]{0, 1, 49, 50};
        Item[] items = new Item[names.length*sellIns.length*qualities.length];
        Item[] newItems = new Item[items.length];
        int number=0;
        for(String name: names){
            for(Integer sellIn: sellIns){
                for(Integer quality: qualities){
                    items[number]= new Item(name, sellIn, quality);
                    newItems[number]= new Item(name, sellIn, quality);
                    number++;
                }
            }
        }
        Refactoring app = new Refactoring(newItems);
        app.updateQuality();
        for(int i=0; i<items.length; i++){
            Item item = items[i];
            Item newItem = newItems[i];
            if(item.sellIn != newItem.sellIn || item.quality != newItem.quality){
                System.out.println(String.format("{ \"%s\", %d, %d, \"%s\", %d, %d },", item.name, item.sellIn, item.quality, newItem.name, newItem.sellIn, newItem.quality));
            }
        }
        assertEquals("", "");
    }
}