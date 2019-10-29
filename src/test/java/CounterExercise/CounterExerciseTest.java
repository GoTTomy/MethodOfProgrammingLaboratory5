package CounterExercise;

import org.junit.Assert;
import org.junit.Test;

public class CounterExerciseTest {

    CounterExercise counter = new CounterExercise();

    @Test
    public void thisShallBeZero(){
        Assert.assertEquals(0,counter.getValue());
    }

    @Test
    public void ThisShallBeHundred(){
        counter.addvalue(1000);
        Assert.assertEquals(100,counter.getValue());
    }

    @Test
    public void ThisShallReturnZero() {
        counter.addvalue(-20);
        Assert.assertEquals(0, counter.getValue());
    }

    @Test
    public void ThisShallBeEqua100And0(){
        counter.setValue(2500);
        Assert.assertEquals(100,counter.getValue());
        counter.setValue(-1000);
        Assert.assertEquals(0,counter.getValue());
    }

}
