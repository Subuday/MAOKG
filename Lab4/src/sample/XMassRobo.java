package sample;

import javax.media.j3d.Appearance;
import javax.media.j3d.Material;
import javax.vecmath.Color3f;

import com.sun.j3d.utils.geometry.Box;

public class XMassRobo {
    public static Box getCone(float dolgota, float visota, float shirina) {
        int primflags = 1;
        return new Box(visota, shirina, dolgota, primflags, getXMassTreeAppearence());
    }
    private static Appearance getXMassTreeAppearence() {
        Appearance ap = new Appearance();
        Color3f emissive = new Color3f(0.4f, 0.9f, 0.9f);
        Color3f ambient = new Color3f(0.2f, 0.1f, 0.1f);
        Color3f diffuse = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f specular = new Color3f(0.0f, 0.0f, 0.0f);
        ap.setMaterial(new Material(ambient, emissive, diffuse, specular, 1.0f));
        return ap;
    }
}