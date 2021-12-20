package tk.nkduy.animationeasing.cubic;

import tk.nkduy.animationeasing.BaseEasingMethod;

public class CubicEaseOut extends BaseEasingMethod {

    public CubicEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*((t=t/d-1)*t*t + 1) + b;
    }
}
