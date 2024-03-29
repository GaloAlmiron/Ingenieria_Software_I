from abc import abstractmethod
from abc import ABCMeta


#Player Interface:
class Player():

    def __init__(self):
        pass
    def open(self,filePath):
        pass
    def play(self):
        pass
    def stop(self):
        pass
    def setVolume(self,value):
        pass


#PlayerPitchable Interface:
class PlayerPitchable():

    def setPitch(self,pitch):
        pass


#VLC concrete class
class VLC(Player,PlayerPitchable): 

    def __init__(self):

        print("The VLC constructor was invoked.")
        self.isOpen = False;
        self.isPlaying = False;
        self.setVolume(10);

    def __del__(self):

        print("The VLC destructor was invoked.")

    def open(self,filePath):

        self.isOpen = True;
        print("The audiofile: " + filePath + " is open.")

    def play(self):

        if(self.isOpen) : self.isPlaying = True;
        print("The audiofile is playing.")

    def stop(self):

        if(self.isPlaying) : self.isPlaying = False;
        print("The audiofile is stopped.")

    def setVolume(self, value):

        self.volume = value;
        print("The volume value is: " + str(self.volume))

    def setPitch(self, value):

        self.pitch = value;
        print("The pitch value is: " + str(self.pitch))


vlcPlayer = VLC();
vlcPlayer.open("./resources/orchestral.ogg");
vlcPlayer.play();
vlcPlayer.setVolume(13);