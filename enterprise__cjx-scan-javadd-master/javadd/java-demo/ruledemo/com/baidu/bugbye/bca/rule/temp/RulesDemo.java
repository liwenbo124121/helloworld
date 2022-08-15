package com.baidu.bugbye.bca.rule.temp;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RulesDemo {

    public void assiginInWhile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(""));
        String line;
        while (!StringUtils.isEmpty(line = br.readLine())) {
            System.out.println(line.toCharArray());
        }
    }

}
