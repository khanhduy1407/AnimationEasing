package tk.nkduy.animationeasing;

public enum  Skill {

    BackEaseIn(tk.nkduy.animationeasing.back.BackEaseIn.class),
    BackEaseOut(tk.nkduy.animationeasing.back.BackEaseOut.class),
    BackEaseInOut(tk.nkduy.animationeasing.back.BackEaseInOut.class),

    BounceEaseIn(tk.nkduy.animationeasing.bounce.BounceEaseIn.class),
    BounceEaseOut(tk.nkduy.animationeasing.bounce.BounceEaseOut.class),
    BounceEaseInOut(tk.nkduy.animationeasing.bounce.BounceEaseInOut.class),

    CircEaseIn(tk.nkduy.animationeasing.circ.CircEaseIn.class),
    CircEaseOut(tk.nkduy.animationeasing.circ.CircEaseOut.class),
    CircEaseInOut(tk.nkduy.animationeasing.circ.CircEaseInOut.class),

    CubicEaseIn(tk.nkduy.animationeasing.cubic.CubicEaseIn.class),
    CubicEaseOut(tk.nkduy.animationeasing.cubic.CubicEaseOut.class),
    CubicEaseInOut(tk.nkduy.animationeasing.cubic.CubicEaseInOut.class),

    ElasticEaseIn(tk.nkduy.animationeasing.elastic.ElasticEaseIn.class),
    ElasticEaseOut(tk.nkduy.animationeasing.elastic.ElasticEaseOut.class),

    ExpoEaseIn(tk.nkduy.animationeasing.expo.ExpoEaseIn.class),
    ExpoEaseOut(tk.nkduy.animationeasing.expo.ExpoEaseOut.class),
    ExpoEaseInOut(tk.nkduy.animationeasing.expo.ExpoEaseInOut.class),

    QuadEaseIn(tk.nkduy.animationeasing.quad.QuadEaseIn.class),
    QuadEaseOut(tk.nkduy.animationeasing.quad.QuadEaseOut.class),
    QuadEaseInOut(tk.nkduy.animationeasing.quad.QuadEaseInOut.class),

    QuintEaseIn(tk.nkduy.animationeasing.quint.QuintEaseIn.class),
    QuintEaseOut(tk.nkduy.animationeasing.quint.QuintEaseOut.class),
    QuintEaseInOut(tk.nkduy.animationeasing.quint.QuintEaseInOut.class),

    SineEaseIn(tk.nkduy.animationeasing.sine.SineEaseIn.class),
    SineEaseOut(tk.nkduy.animationeasing.sine.SineEaseOut.class),
    SineEaseInOut(tk.nkduy.animationeasing.sine.SineEaseInOut.class),

    Linear(tk.nkduy.animationeasing.linear.Linear.class);


    private Class easingMethod;

    private Skill(Class clazz) {
        easingMethod = clazz;
    }

    public BaseEasingMethod getMethod(float duration) {
        try {
            return (BaseEasingMethod)easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
