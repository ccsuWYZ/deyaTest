package com.deya.methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author lee
 * @date 2023-11-22 14:53:39
 * @description
 */
public class runCmd {
    private static void runCmd(String filePath) {

        BufferedReader bufferedReader = null;
        try {
            // 执行命令返回执行的子进程对象
            Process proc = new ProcessBuilder(filePath).start();
            // 获取子进程的错误流，并打印
            bufferedReader = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception ex) {
                }
            }
        }
    }
}
