class VLCPlayer implements Player, PlayerPitchable
{
    public VLCPlayer()
    {
        System.out.println("The VLC constructor was invoked.");
    }
    public void open(String filePath)
    {
        isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
    }
    public void play()
    {
        if(isOpen) this.isPlaying = true;
        System.out.println("The audiofile is playing.");
    }
    public void stop()
    {
        if(isPlaying) this.isPlaying = false;
        System.out.println("The audiofile is stopped.");
    }
    public void setVolume(float value)
    {
        this.volume = value;
    }
    public float getVolume()
    {
        return this.volume;

    }
    public void setPitch(float value)
    {
        this.pitch = value;
        System.out.println("The pitch value is: " + this.pitch);
    }

    private float volume;
    private boolean isPlaying;
    private boolean isOpen;
    private float pitch;
}

public class Main {
    public static void main(String args[])
    {
        VLCPlayer vlc = new VLCPlayer();
        vlc.open("./resources/orchestral.ogg");
        vlc.play();
        vlc.stop();
        vlc.setVolume(13);
    }
}

