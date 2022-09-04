import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void givenValidInputNumsReturnNotNullResult(){
        Main main = new Main();
        int[] nums = {2,6,3,15};
        int target = 9;
        int[] result= main.getTarget(nums,target);
        Assert.assertTrue(result[0]==1);
        Assert.assertTrue(result[1]==2);
        Assert.assertTrue(nums[result[0]]==6);

    }

    @Test
    public void givenInvalidValidInputNumsReturnNotNullResult(){
        Main main = new Main();
        int[] nums = {0,7,11,15};
        int target = 99;
        int[] result= main.getTarget(nums,target);
        Assert.assertTrue(result[0]==0);
        Assert.assertTrue(result[1]==0);
    }
}
