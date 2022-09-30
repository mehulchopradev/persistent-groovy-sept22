package com.rise1116.geometry.domain

import com.abc.geometry.Shape

class Circle extends Shape {

    Double radius

    @Override
    Double area() {
        Math.PI * (this.radius ** 2)
    }

    @Override
    Double perimeter() {
        2 * Math.PI * this.radius
    }
}
