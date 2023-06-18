package com.trenditra;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static Utils.Files.readTextFromPath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TxtFilesTests {

    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedData = "Example";

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
