
public class User {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("Is Tv on ? " + smartTv.isOn);
    System.out.println("What is Tv channel ? " + smartTv.channel);
    System.out.println("What is Tv volume ? " + smartTv.volume);

    smartTv.decVolume();
    System.out.println("Tv volume when tv is off ? " + smartTv.volume);
    smartTv.ascVolume();
    System.out.println("Tv volume when tv is off ? " + smartTv.volume);

    smartTv.toggleTvPower();
    System.out.println("Is Tv on ? " + smartTv.isOn);

    smartTv.decVolume();
    smartTv.decVolume();
    smartTv.decVolume();
    System.out.println("What is Tv volume ? " + smartTv.volume);
    smartTv.ascVolume();
    System.out.println("What is Tv volume ? " + smartTv.volume);

    smartTv.ascChannel();
    smartTv.ascChannel();
    smartTv.ascChannel();
    smartTv.ascChannel();
    System.out.println("What is Tv channel ? " + smartTv.channel);

    smartTv.changeChannel(120);
    smartTv.decChannel();
    System.out.println("What is Tv channel ? " + smartTv.channel);
    smartTv.toggleTvPower();
    smartTv.decChannel();
    System.out.println("What is Tv channel ? " + smartTv.channel);

  }
}
