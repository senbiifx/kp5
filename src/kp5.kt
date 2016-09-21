/**
 * ------------------------------
 * Canvas
 * ------------------------------
 */
@native fun createCanvas(w: Double, h: Double): Unit = noImpl


/**
 * ------------------------------
 * Color
 * ------------------------------
 */
@native class Color
@native fun color(gray: Int, alpha: Int  = 0): Color = noImpl
@native fun color(r: Int, g: Int, b: Int, alpha: Double  = 1.0): Color = noImpl
@native fun fill(colorString: String): Unit = noImpl
@native fun fill(v1: Int, v2: Int = 0, v3: Int = 0, alpha: Double = 1.0): Unit = noImpl
@native fun background(color: Color, alpha: Double = 1.0): Unit = noImpl
@native fun background(colorString: String, alpha: Double = 1.0): Unit = noImpl
@native fun background(gray: Int, alpha: Double = 1.0): Unit = noImpl
@native fun background(v1: Int, v2: Int, v3: Int, alpha: Double = 1.0): Unit = noImpl
@native fun stroke(v1: Int, v2: Int = 0, v3: Int = 0, alpha: Double = 1.0): Unit = noImpl
@native fun noFill(): Unit = noImpl
@native fun noStroke(): Unit = noImpl

@native fun colorMode(mode: String,
                      v1: Int = 0,
                      v2: Int = 0,
                      v3: Int = 0,
                      alpha: Double = 0.0): Unit = noImpl
@native val HSB: String = noImpl
@native val RGB: String = noImpl
@native val HSL: String = noImpl
/**
 * ------------------------------
 * Shape
 * ------------------------------
 */
@native class P5
@native fun line(x1: Double, y1: Double, x2: Double, y2: Double): P5
@native fun ellipse(x: Double, y: Double, w: Double, h: Double = w): P5
@native fun rect(x: Double,
                 y: Double,
                 w: Double,
                 h : Double,
                 tl: Double = 0.0,
                 tr: Double = 0.0,
                 br: Double = 0.0,
                 bl: Double = 0.0): P5
@native fun strokeWeight(weight: Double): P5

/**
 * ------------------------------
 * Typography
 * ------------------------------
 */
@native val NORMAL: String = noImpl
@native val ITALIC: String = noImpl
@native val BOLD: String = noImpl
@native fun text(str: String, x: Double, y: Double, x2: Double = 0.0, y2: Double = 0.0): P5
@native fun textSize(size: Double): dynamic
@native fun textStyle(style: String): dynamic
@native fun textFont(font: String): dynamic
/**
 * ------------------------------
 * Transform
 * ------------------------------
 */
@native fun rotate(num: Double, axis: Double = 0.0): P5
@native fun translate(x: Double, y: Double, z: Double = 0.0): P5

/**
 * ------------------------------
 * Math
 * ------------------------------
 */
@native fun map(value: Double,start1: Double,stop1: Double,start2: Double,stop2: Double): Double
@native fun dist(x1: Double, y1: Double, x2: Double, y2: Double): Double
@native fun sin(angle: Double): Double
@native fun cos(angle: Double): Double
@native fun tan(angle: Double): Double
@native fun radians(angle: Double): Double
@native fun degrees(angle: Double): Double
@native fun random(): Double
@native fun random(min: Int = 0, max: Int): Int
@native fun random(max: Int): Int

/**
 * ------------------------------
 * Environment
 * ------------------------------
 */
@native var windowWidth: Double = noImpl
@native var windowHeight: Double = noImpl
@native var width: Double = noImpl
@native var height: Double = noImpl


/**
 * ------------------------------
 * Events
 * ------------------------------
 */
@native var mouseX: Double = noImpl
@native var mouseY: Double = noImpl
@native var touchX: Double = noImpl
@native var touchY: Double = noImpl