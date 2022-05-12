package com.company;

import java.awt.image.RGBImageFilter;

public class StaticClasses{

    public StaticClasses(){}

    public static class BackgroundFilter extends RGBImageFilter {

        boolean setUp = false;
        int bgColor;

        @Override
        public int filterRGB(int x, int y, int rgb) {
            int colorWOAlpha = rgb & 0xFFFFFF;
            if( ! setUp && x == 0 && y == 0 ){
                bgColor = colorWOAlpha;
                setUp = true;
            }
            else if( colorWOAlpha == bgColor )
                return colorWOAlpha;
            return rgb;
        }
    }
}

