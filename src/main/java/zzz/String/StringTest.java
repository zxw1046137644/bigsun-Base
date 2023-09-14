package zzz.String;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StringTest {


    @Test
    public void StringTest() {
        /**
         * 字符串拼接  String.join
         */
        String py = "pytest -vs ";
        String dir = "E:/project/lm/PycharmProjects/bigsun-python";
        String casePackage = "/auto/test/open";
        String caseFile = "/test_open.py";
        String caseClass = "TestRun1";
        String caseName = "test_open1";
        List caseList = Arrays.asList(caseFile, caseClass, caseName);
        //String caseDir = String.join("::", caseFile, caseClass, caseName);
        String caseDir = String.join("::", caseList);
        System.out.println(caseDir);
    }

}
