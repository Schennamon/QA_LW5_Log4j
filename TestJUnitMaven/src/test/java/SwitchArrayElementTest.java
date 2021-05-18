import org.junit.*;

public class SwitchArrayElementTest {
    SwitchArrayElement sae = new SwitchArrayElement();
    int[] arr = {1,2,3,4,5,6,7};

    @Test
    public void testSwitchElement(){
        int[] result = sae.switchElement(arr);
        int[] expectedResult = {7,6,5,4,3,2,1};

        Assert.assertArrayEquals(expectedResult, result);
    }

}
