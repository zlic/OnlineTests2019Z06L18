package com.acquisio.basic.java.question08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * QUESTION 09: Lambdas (https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
 * Using JDK8 Lambdas, add the code to transform the input file to apply those rules.
 * 1- Keep lines where the amount is greater than or equals to 50$
 * 2- Add a Taxes column right after the Amount column, which is 15% of the Amount.
 * 3- Add a Total column right after the Taxes column, which is the sum of Amount and Taxes.
 * 4- Remove the ShoppingCartTitle columns.
 * <p>
 * The input file contains those columns
 * User,Amount,ShoppingCartTitle,NbItems
 * <p>
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class Lambdas {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Lambdas instance = new Lambdas();
        File input = new File(Thread.currentThread().getContextClassLoader().getResource("./carts.csv").toURI());
        File output = new File("./carts_output.csv");
        output.delete();

        instance.convertCarts(input, output);

        if (output.exists()) {
            Files.lines(output.toPath()).forEachOrdered(line -> System.out.println(line));
        }
    }

    void convertCarts(File input, File output) throws IOException {
            Stream<String> lines = Files.lines(input.toPath());
            List<String> collected = lines.map(line-> new LinkedList<String>(Arrays.asList(line.split(","))))
                    .filter(list -> Float.valueOf(list.get(1)) >= 50.0)
                    .map(list->changeColumns(list))
                    .collect(Collectors.toList());
            saveToFile(output.getAbsolutePath(), collected);
    }

    /**
     * Change columns
     * <p>
     * - Add a Taxes column right after the Amount column, which is 15% of the Amount.
     * - Add a Total column right after the Taxes column, which is the sum of Amount and Taxes.
     * - Remove the ShoppingCartTitle columns.
     * @param list A List of String
     * @return joined String with comma
     */
    private String changeColumns(List<String> list){
        Float amount = Float.valueOf(list.get(1));
        Float taxes = amount * 0.15f;
        list.add(2, String.valueOf(taxes));
        list.add(3, String.valueOf(amount + taxes));
        list.remove(4);
        return String.join(",", list);
    }

    /**
     * Save a List of String to file
     * <p>
     *     each element in the List is in a new line
     * @param path file path
     * @param list a List of String
     */
    private void saveToFile(String path, List<String> list) {
        FileWriter csvWriter = null;
        try {
            csvWriter = new FileWriter(path);
            for (String line : list) {
                csvWriter.append(line);
                csvWriter.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (csvWriter != null) {
                try {
                    csvWriter.flush();
                    csvWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
