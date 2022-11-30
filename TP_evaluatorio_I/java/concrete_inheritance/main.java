class AudioPlayer
{
    private boolean isOpen;
    private boolean isPlaying;
    private float volume;

    public AudioPlayer()
    {
        System.out.println("The AudioPlayer constructor was invoked.");
        this.isOpen = false;
        this.isPlaying = false;
    }
    public void open(String filePath)
    {
        this.isOpen = true;
        System.out.println("The audiofile: " + filePath + " is open.");
    }
    public void play()
    {
        if(isOpen) isPlaying = true;
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
}
class  VLC extends AudioPlayer
{
    public VLC()
    {
        System.out.println("The VLC constructor was invoked.");
        this.setVolume(10);
        this.setPitch(5);
    }
    public void setPitch(float value)
    {
        this.pitch = value;
    }
    float pitch;
}

public class Main
{
    public static void main(String args[])
    {
        AudioPlayer player = new AudioPlayer();
        player.open("/resources/orchestral.ogg");
        player.play();
        player.setVolume(5);
        
        System.out.println("");

        VLC vlcPlayer = new VLC();
        vlcPlayer.open("/resources/orchestral.ogg");
        vlcPlayer.play();
        vlcPlayer.setVolume(13);

        System.out.println("");
    }
}