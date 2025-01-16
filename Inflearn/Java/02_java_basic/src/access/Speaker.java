package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("볼륨을 증가할 수 없습니다. 최대 볼륨입니다.");
        } else {
            volume += 10;
            System.out.println("볼륨을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨을 10 감소합니다.");
    }

    void showVolume() {
        System.out.println("현재 볼륨: " + volume);
    }
}
