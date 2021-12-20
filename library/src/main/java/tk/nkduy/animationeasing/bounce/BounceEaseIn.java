package tk.nkduy.animationeasing.bounce;

import tk.nkduy.animationeasing.BaseEasingMethod;

public class BounceEaseIn extends BaseEasingMethod {

    private BounceEaseOut mBounceEaseOut;

    public BounceEaseIn(float duration){
        super(duration);
        mBounceEaseOut = new BounceEaseOut(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c - mBounceEaseOut.calculate(d-t, 0, c, d) + b;
    }
}
