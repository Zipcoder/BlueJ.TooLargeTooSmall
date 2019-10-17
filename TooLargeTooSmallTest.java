

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TooLargeTooSmallTest
{
    @Test
    public void TestRun1()
    {
        // given
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall(5);
        
        // when
        
        //then
        assertEquals(Integer.valueOf(0), tooLarge1.guess(5));
    }
    
    @Test
    public void TestRun2()
    {
        //given
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall(6);
        //when
        assertEquals(Integer.valueOf(-1), tooLarge1.guess(4));
    }
    
    @Test
    public void TestRun3()
    {
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall(2);
        
        assertEquals(Integer.valueOf(-1), tooLarge1.guess(1));
        assertEquals(Integer.valueOf(0), tooLarge1.guess(2));
        assertEquals(Integer.valueOf(1), tooLarge1.guess(3));
    }
    
   
}

