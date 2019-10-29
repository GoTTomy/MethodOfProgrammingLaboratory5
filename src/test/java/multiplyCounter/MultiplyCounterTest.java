package multiplyCounter;

import CounterExercise.CounterExercise;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class MultiplyCounterTest {

    @Mock
    CounterExercise ce = new CounterExercise();
    MultiplyCounter mc = new MultiplyCounter();


    @Test
    public void ThisShallReturn0(){
        mc.multiply(ce,123123123);
        Assert.assertEquals(0,mc.getValue());
    }

    @Test
    public void voidThisShallReturn40(){
        ce.addvalue(20);
        mc.multiply(ce,2);
        Assert.assertEquals(40,mc.getValue());
    }

    @Test
    public void ThisShallReturnminus40(){
        ce.addvalue(20);
        mc.multiply(ce,-2);
        Assert.assertEquals(-40,mc.getValue());
    }
}
