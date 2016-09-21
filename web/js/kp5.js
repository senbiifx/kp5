(function (Kotlin) {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    setup: function () {
      var c = createCanvas(700.0, 400.0);
      c.parent('myContainer');
    },
    draw: function () {
      background(255);
      _.drawBackground();
      _.drawText();
    },
    drawBackground: function () {
      var tmp$0, tmp$1;
      colorMode(HSB);
      strokeWeight(0.5);
      stroke(255);
      tmp$0 = Kotlin.modules['stdlib'].kotlin.ranges.step_7isp7r$(new Kotlin.NumberRange(0, width | 0), 20).iterator();
      while (tmp$0.hasNext()) {
        var x = tmp$0.next();
        tmp$1 = Kotlin.modules['stdlib'].kotlin.ranges.step_7isp7r$(new Kotlin.NumberRange(0, height | 0), 20).iterator();
        while (tmp$1.hasNext()) {
          var y = tmp$1.next();
          fill(166, 84, 68 + random(-8, 8));
          rect(x, y, 20.0, 20.0);
        }
      }
    },
    drawText: function () {
      fill('rgba(255,255,255,0.8)');
      noStroke();
      textSize(100.0);
      textFont('Segoe UI');
      text('p5.js + kotlin', 80.0, 190.0);
    }
  });
  Kotlin.defineModule('kp5', _);
}(Kotlin));
