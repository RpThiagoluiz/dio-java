
public class SmartTv {
  boolean isOn = false;
  int channel = 1;
  int volume = 12;

  public void toggleTvPower() {
    isOn = !isOn;
  }

  public void ascVolume() {
    if (isOn) {
      volume++;
    }
  }

  public void decVolume() {
    if (isOn) {
      volume--;
    }
  }

  public void ascChannel() {
    if (isOn) {
      channel++;
    }

  }

  public void decChannel() {
    if (isOn && channel > 0) {
      channel--;
    }
  }

  public void changeChannel(int newChannel) {
    if (isOn && newChannel > 0) {
      channel = newChannel;
    }
  }

}
