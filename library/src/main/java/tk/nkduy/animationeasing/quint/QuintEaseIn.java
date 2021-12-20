package tk.nkduy.animationeasing.quint;

import tk.nkduy.animationeasing.BaseEasingMethod;

public class QuintEaseIn extends BaseEasingMethod{
    public QuintEaseIn(float duration) {
        super(duration);
    }

    @Override
    public Float calculate(float t, float b, float c, float d) {
        return c*(t/=d)*t*t*t*t + b;
    }
}
