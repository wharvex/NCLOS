package com.wharvex.nclos.app;


import static com.wharvex.nclos.app.MessageUtils.getMessage;
import static com.wharvex.nclos.utilities.StringUtils.join;
import static com.wharvex.nclos.utilities.StringUtils.split;

import org.apache.commons.text.WordUtils;

import com.wharvex.nclos.list.LinkedList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Thread.currentThread().setName("mainThread");
        OutputHelper.debugPrint("BEGIN EXECUTION TRACE");
        var bl = new Bootloader();
        bl.init();
        Scanner sc = new Scanner(System.in);
        while (!sc.nextLine().equals("x")) {
        }
        OutputHelper.debugPrint("END EXECUTION TRACE");
        System.exit(0);
    }
}
