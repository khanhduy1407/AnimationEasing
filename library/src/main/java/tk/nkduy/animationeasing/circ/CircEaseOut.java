package tk.nkduy.animationeasing.circ;

import tk.nkduy.animationeasing.BaseEasingMethod;

public class CircEaseOut extends BaseEasingMethod{

    public CircEaseOut(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c * (float)Math.sqrt(1 - (t=t/d-1)*t) + b;
    }
}
