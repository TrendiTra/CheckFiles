package com.trenditra;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PdfFilesTests {

    @Test
    void downloadPdfTest() throws Exception {
        open("https://junit.org/junit5/docs/current/user-guide/");
        File download = $(byText("PDF download")).download();
        PDF parsed = new PDF(download);
        assertThat(parsed.author).contains("Marc Philipp");
    }
}
