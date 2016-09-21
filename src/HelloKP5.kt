fun setup(){
    var c = createCanvas(700.00, 400.0)
    c.parent("myContainer")
}

fun draw(){
    background(255)
    drawBackground()
    drawText()
}

fun drawBackground(){
    colorMode(HSB)
    strokeWeight(0.5);
    stroke(255);
    for(x in 0..width.toInt() step 20){
        for(y in 0..height.toInt() step 20){
            fill(166, 84, 68 + random(-8, 8))
            rect(x.toDouble(), y.toDouble(), 20.0, 20.0)
        }
    }
}

fun drawText(){
    fill("rgba(255,255,255,0.8)")
    noStroke()
    textSize(100.0)
    textFont("Segoe UI")
    text("p5.js + kotlin", 80.0, 190.0)
}

