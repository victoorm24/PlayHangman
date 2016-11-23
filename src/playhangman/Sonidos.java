package playhangman;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sonidos {
    public static final AudioClip perdedor = Applet.newAudioClip(Sonidos.class.getResource("/sonidos/Perdedor(1).wav"));
    public static final AudioClip perdedor2 = Applet.newAudioClip(Sonidos.class.getResource("/sonidos/Perdedor(2).wav"));
    public static final AudioClip ganador = Applet.newAudioClip(Sonidos.class.getResource("/sonidos/Ganador(1).wav"));
    public static final AudioClip ganador2 = Applet.newAudioClip(Sonidos.class.getResource("/sonidos/Ganador(2).wav"));
    public static final AudioClip welcome = Applet.newAudioClip(Sonidos.class.getResource("/sonidos/Welcome.wav"));
    public static final AudioClip registro = Applet.newAudioClip(Sonidos.class.getResource("/sonidos/Registro.wav"));
    public static final AudioClip inicio = Applet.newAudioClip(Sonidos.class.getResource("/sonidos/Inicio.wav"));
    
}