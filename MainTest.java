package com.ly.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * @ClassName MainTest
 * @Author Roger_Linux
 * @Date 11.22 3:44 PM
 * @Description main
 */
public class MainTest {
    public static void main(String[] args) {
        try {
            String cmd = "git clone https://github.com/RogerLee2000/learngit.git /home/roger/myGit/lll";

            Process ps = Runtime.getRuntime().exec(new String[]{File.separator + "bin" + File.separator + "sh", "-c",cmd});

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));

            StringBuffer sb = new StringBuffer();

            String line;

            while ((line = br.readLine()) != null) {

                sb.append(line).append("\n");

            }

            String result = sb.toString();

            System.out.println(result);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
