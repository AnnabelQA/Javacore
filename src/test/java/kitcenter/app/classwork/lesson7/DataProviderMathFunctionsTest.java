package kitcenter.app.classwork.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by annabilous on 5/13/17.
 */

    @RunWith(JUnitParamsRunner.class)

    public class DataProviderMathFunctionsTest {

        @Test

        @FileParameters(value = "src/test/resources/testdata.csv",

                mapper = CsvWithHeaderMapper.class)

        public void dataProviderTestMultiply(int argA, int argB, int expOut) {
            int actualResult = Math.multiplyExact(argA,argB);
            Assert.assertEquals(expOut, actualResult);
            System.out.println(expOut + ", " + actualResult);

        } //make sure that variables are in same order and types as in csv file

    }
