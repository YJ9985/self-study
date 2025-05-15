package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근 -> 문제 발생. 따라서 접근을 막을 수 있는 방법이 필요
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; //private 으로 수정하면 더 이상 접근 불가
        speaker.showVolume();

    }
}
