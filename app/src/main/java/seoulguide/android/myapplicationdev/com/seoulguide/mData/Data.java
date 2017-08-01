package seoulguide.android.myapplicationdev.com.seoulguide.mData;

/**
 * Created by 15031795 on 5/5/2017.
 */

public class Data {
    String name;
    String addr;
    int img;

    public Data(String name, String addr, int img) {
        this.name = name;
        this.addr = addr;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public int getImg() {
        return img;
    }
}
