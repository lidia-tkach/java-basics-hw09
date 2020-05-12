import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraysTest {

    @DataProvider(name = "ArrayUtil")
    public static Object[][] arrays() {
        return new Object[][]{
                {
                        new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
                        new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
                        new String[]{"JAVA", "SQL"}
                },
                {
                        new String[]{"here", "is", "some", "text", ".", "text"},
                        new String[]{"some", "text", "above", "."},
                        new String[]{"some", "text", "."}
                },
                {
                        new String[]{"hello", "bye", "thanks", "welcome", "hi", "bye"},
                        new String[]{"hi", "hi", "hello", "hello", "hello"},
                        new String[]{"hi", "hello"}
                },
                {
                        new String[]{"red", "black", "white", "green"},
                        new String[]{"blue", "yellow", "orange", "purple"},
                        new String[]{}
                }
        };
    }

    @Test(dataProvider = "ArrayUtil")
    public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

        assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
                "Common elements are not correct");
    }
}