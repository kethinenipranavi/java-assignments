package tests;
import org.junit.Test;
import main.Telivision;
import static org.junit.Assert.*;
public class TelivisionTest
{
	@Test
	public void volumeTestOfCurrentVolume()
	{
		assertEquals(8,new Telivision().volumeOfTelivison());
	}
	@Test
	public void volumeTestOfIncreaseOfVolume()
	{
		assertEquals(9,new Telivision().volumeIncreaseOfTelivision());
	}
	
}