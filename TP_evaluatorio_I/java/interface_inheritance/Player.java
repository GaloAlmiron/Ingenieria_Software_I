public interface Player
{
    public abstract void open(String filePath);
    public abstract void play();
    public abstract void stop();
    public abstract void setVolume(float value);
}