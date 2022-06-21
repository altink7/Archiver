package archiver.archiver;
import org.junit.*;

public class ArchiverTests {

    @Test
    public void test_number_between_0_and_100(){
        RandomNumberController controller = new RandomNumberController();

        int expected = -1;
        int actual = controller.randomNumber();

        int[] list= numberList(0,99);
        for(int a: list){
            if (a == actual) {
                expected = actual;
                break;
            }
        }

        Assert.assertEquals("should be ok!",expected,actual);
    }

    @Test
    public void test_number_is_not_the_same_always(){
        RandomNumberController controller = new RandomNumberController();

        boolean expected = false;
        boolean actual = controller.randomNumber() == controller.randomNumber();

        Assert.assertEquals("should be ok!",expected,actual);
    }






    public int[] numberList(int start, int end){
        int[] num = new int[end-start+1];
        for(int i=0;start<end;start++,i++){
            num[i]=start;
        }
        return num;
    }
}
