package com.acquisio.basic.java.question05;

import static org.junit.Assert.*;

import org.junit.Test;


public class RefactoringTest {

    //@Test
    public void testName() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        Refactoring app = new Refactoring(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
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