package main;
public class Telivision
{
	private boolean stateOfTelivison =false;
	public final int maxChannel = 120;
    	public final int minChannel = 1;
    	public final int maxVolume  = 20;
    	public final int minVolume  = 1;
	private int currentVolume=8;
	private int currentChannel=8;
	public boolean setStateOfTelivison(boolean stateOfTelivison)
	{
		this.stateOfTelivison = stateOfTelivison;
		if(stateOfTelivison)
		{
			return stateOfTelivison = true;
		}
		else
		{
			return stateOfTelivison = false;
		}
	}
	public int volumeOfTelivison()
	{
		return currentVolume;
	}
	public int channelOfTelivision()
	{
		return currentChannel;
	}
	public int volumeIncreaseOfTelivision()
	{
		return (currentVolume+1) ;
	}
	public int volumeDecreaseOfTelivision()
	{
		return (currentVolume-1) ;
	}
	public int channelIncreaseOfTelivision()
	{
		return (currentChannel+1) ;
	}
	public int channelDecreaseOfTelivision()
	{
		return (currentChannel-1);
	}
}